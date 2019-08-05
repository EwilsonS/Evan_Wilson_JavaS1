package com.trilogyed.tasker.controller;

import com.trilogyed.tasker.exception.NotFoundException;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import com.trilogyed.tasker.service.TaskerServiceLayer;
import com.trilogyed.tasker.util.feign.AdserverClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RefreshScope
public class TaskerController {

    @Autowired
    private TaskerServiceLayer service;

    public TaskerController(TaskerServiceLayer service) {
        this.service = service;
    }

    // Create new task
    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public TaskViewModel createTask(@RequestBody @Valid TaskViewModel tvm) {
        return service.newTask(tvm);
    }

    // Find task by id
    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TaskViewModel getTask(@PathVariable("id") int id) {
        if (service.fetchTask(id) == null)
            throw new NullPointerException("Sorry there is no task with ID: " + id);
        return service.fetchTask(id);
    }

    // Find all tasks
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> getAllTasks() {
        if (service.fetchAllTasks().size() == 0)
            throw new NotFoundException("Uh oh, looks like no tasks have been added yet, be the first!" +
                    "Post to route '/tasks'");
        return service.fetchAllTasks();
    }

    // Delete task
    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable("id") int id) {
        service.deleteTask(id);
    }

    // Update task
    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTask(@PathVariable("id") int id, @RequestBody @Valid TaskViewModel tvm) {
        if (tvm.getId() == 0)
            tvm.setId(id);
        if (id != tvm.getId())
            throw new IllegalArgumentException("Id in path must match id view model id");
        service.updateTask(tvm);
    }

    // Get all tasks with a specific category
    @RequestMapping(value = "/tasks/category?{category}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> getTasksByCategory(@PathVariable("category") String category) {
        if (service.fetchTasksByCategory(category).size() == 0)
            throw new NotFoundException("Hmm, no results found for category " + category);
        return service.fetchTasksByCategory(category);
    }
}
