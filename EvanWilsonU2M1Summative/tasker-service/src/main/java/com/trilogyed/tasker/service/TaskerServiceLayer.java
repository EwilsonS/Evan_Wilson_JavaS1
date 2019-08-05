package com.trilogyed.tasker.service;

import com.trilogyed.tasker.controller.TaskerController;
import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import com.trilogyed.tasker.util.feign.AdserverClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskerServiceLayer {

    @Autowired
    TaskerDao dao;
    @Autowired
    AdserverClient client;

    @Autowired
    protected TaskerServiceLayer(TaskerDao dao, AdserverClient client) {
        this.dao = dao;
        this.client = client;
    }

    public TaskViewModel fetchTask(int id) {
        if (dao.getTask(id) == null)
            throw new NullPointerException("task_id " + id + " does not exist in this data set");
        Task task = dao.getTask(id);
        TaskViewModel tvm = new TaskViewModel();

        tvm.setId(task.getId());
        tvm.setDescription(task.getDescription());
        tvm.setCreateDate(task.getCreateDate());
        tvm.setDueDate(task.getDueDate());
        tvm.setCategory(task.getCategory());

        // get ad from Adserver and put in tvm
        tvm.setAdvertisement(client.getRandomAd());

        return tvm;
    }

    public List<TaskViewModel> fetchAllTasks() {
        List<Task> tasks = dao.getAllTasks();
        List<TaskViewModel> taskViewModels = new ArrayList<>();

        for (Task t : tasks) {
            TaskViewModel tvm = buildTaskViewModel(t);
            taskViewModels.add(tvm);
        }
        return taskViewModels;
    }

    public List<TaskViewModel> fetchTasksByCategory(String category) {
        List<Task> tasks = dao.getTasksByCategory(category);
        List<TaskViewModel> taskViewModels = new ArrayList<>();

        for (Task t : tasks) {
            TaskViewModel tvm = buildTaskViewModel(t);
            taskViewModels.add(tvm);
        }
        return taskViewModels;
    }

    public TaskViewModel newTask(TaskViewModel taskViewModel) {

        Task task = new Task();
        task.setDescription(taskViewModel.getDescription());
        task.setCreateDate(taskViewModel.getCreateDate());
        task.setDueDate(taskViewModel.getDueDate());
        task.setCategory(taskViewModel.getCategory());
        task = dao.createTask(task);

        taskViewModel.setId(task.getId());

        // get ad from Adserver and put in taskViewModel
        if (client.getRandomAd().isEmpty())
            throw new NullPointerException("There is no Ad to display");
        taskViewModel.setAdvertisement(client.getRandomAd());

        return taskViewModel;
    }

    public void deleteTask(int id) {
        dao.deleteTask(id);
    }

    @Transactional
    public void updateTask(TaskViewModel tvm) {
        Task task = dao.getTask(tvm.getId());
        task.setId(tvm.getId());
        if (tvm.getDescription() != null) {
            task.setDescription(tvm.getDescription());
        }
        if (tvm.getCreateDate() != null) {
            task.setCreateDate(tvm.getCreateDate());
        }
        if (tvm.getDueDate() != null) {
            task.setDueDate(tvm.getDueDate());
        }
        if (tvm.getCategory() != null) {
            task.setCategory(tvm.getCategory());
        }
        dao.updateTask(task);
    }

    // -------------------------------------------------------
    // BuildViewModel helper method
    // -------------------------------------------------------
    private TaskViewModel buildTaskViewModel(Task task) {
        TaskViewModel tvm = new TaskViewModel();
        tvm.setId(task.getId());
        tvm.setDescription(task.getDescription());
        tvm.setCreateDate(task.getCreateDate());
        tvm.setDueDate(task.getDueDate());
        tvm.setCategory(task.getCategory());
        tvm.setAdvertisement(client.getRandomAd());
        return tvm;
    }
}
