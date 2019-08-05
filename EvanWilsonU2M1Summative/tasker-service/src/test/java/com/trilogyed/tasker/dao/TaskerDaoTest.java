package com.trilogyed.tasker.dao;

import com.trilogyed.tasker.model.Task;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskerDaoTest {

    @Autowired
    TaskerDao dao;

    @Before
    public void setUp() throws Exception {
        dao.getAllTasks().stream().forEach(task -> dao.deleteTask(task.getId()));
    }

    @Test
    public void addGetGetAllGetByCategoryDeleteTask() {
        Task task = new Task();
        task.setDescription("desc");
        task.setCreateDate(LocalDate.of(2010, 1, 10));
        task.setDueDate(LocalDate.of(2010, 5, 10));
        task.setCategory("category");

        // add
        task = dao.createTask(task);

        //get
        Task task2 = task;
        assertEquals(task, task2);

        // get all
        dao.createTask(task);
        dao.createTask(task);
        dao.createTask(task);
        assertEquals(4, dao.getAllTasks().size());

        // get by category
        task.setCategory("category2");
        dao.createTask(task);
        assertEquals(1, dao.getTasksByCategory("category2").size());

        // delete
        dao.deleteTask(task.getId());
        assertEquals(4, dao.getAllTasks().size());
    }

    @Test
    public void updateTask() {
        Task task = new Task();
        task.setDescription("desc");
        task.setCreateDate(LocalDate.of(2010, 1, 10));
        task.setDueDate(LocalDate.of(2010, 5, 10));
        task.setCategory("category");

        // add
        task = dao.createTask(task);

        //update
        task.setCategory("update category");
        dao.updateTask(task);

        assertEquals("update category", dao.getTask(task.getId()).getCategory());
    }

}