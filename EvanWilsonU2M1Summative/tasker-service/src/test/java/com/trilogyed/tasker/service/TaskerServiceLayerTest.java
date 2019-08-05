package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.dao.TaskerDaoJdbcTemplateImpl;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import com.trilogyed.tasker.util.feign.AdserverClient;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class TaskerServiceLayerTest {
    // Field injection
    TaskerDao dao;
    AdserverClient client;
    TaskerServiceLayer service;

    @Before
    public void setUp() throws Exception {
        // Run set up methods to emulate database
        setUpTaskerDaoMock();
        setUpClientMock();

        // Connect service layer to DAOs making service layer the entry point
        service = new TaskerServiceLayer(dao, client);
    }

    // -----------------------------------------------------------------
    // Mock set up
    // -----------------------------------------------------------------
    private void setUpTaskerDaoMock() {
        dao = mock(TaskerDaoJdbcTemplateImpl.class);
        Task task = new Task();
        task.setId(1);
        task.setDescription("Mock task description");
        task.setCreateDate(LocalDate.of(2010, 1, 10));
        task.setDueDate(LocalDate.of(2010, 5, 10));
        task.setCategory("Mock task category");

        Task task2 = new Task();
        task2.setDescription("Mock task description");
        task2.setCreateDate(LocalDate.of(2010, 1, 10));
        task2.setDueDate(LocalDate.of(2010, 5, 10));
        task2.setCategory("Mock task category");

        Task task3 = new Task();
        task.setId(2);
        task3.setDescription("Mock task description");
        task3.setCreateDate(LocalDate.of(2010, 1, 10));
        task3.setDueDate(LocalDate.of(2010, 5, 10));
        task3.setCategory("Special Category");

        List<Task> tasks = new ArrayList<>();
        tasks.add(task);
        tasks.add(task3);

        List<Task> tasksByCategory = new ArrayList<>();
        tasksByCategory.add(task3);

        doReturn(task).when(dao).createTask(task2);
        doReturn(task).when(dao).getTask(1);
        doReturn(tasks).when(dao).getAllTasks();
        doReturn(tasksByCategory).when(dao).getTasksByCategory("Special Category");
    }

    private void setUpClientMock() {
        client = mock(AdserverClient.class);
        String ad = "Random Ad";

        doReturn(ad).when(client).getRandomAd();
    }

    // -----------------------------------------------------------------
    // Tests
    // -----------------------------------------------------------------
    @Test
    public void createNewFetchTask() {
        TaskViewModel tvm = new TaskViewModel();
        tvm.setDescription("Mock task description");
        tvm.setCreateDate(LocalDate.of(2010, 1, 10));
        tvm.setDueDate(LocalDate.of(2010, 5, 10));
        tvm.setCategory("Mock task category");

        // create new task
        tvm = service.newTask(tvm);

        // fetch task
        TaskViewModel tvm2 = service.fetchTask(1);
        assertEquals(tvm2, tvm);
    }

    @Test
    public void fetchAllFetchTasksByCategory() {
        // fetch all tasks
        assertEquals(2, service.fetchAllTasks().size());

        // fetch all tasks with category "Special Category"
        assertEquals(1, service.fetchTasksByCategory("Special Category").size());
    }
}