package com.trilogyed.tasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EvanWilsonU2M1Summative
 * @author Evan Wilson
 * @version 0.1.0
 *
 * Tasker is a simple task-tracking web service. This service uses the
 * adserer service to append a randomly generated advertisement string
 * to a view model object. Each service is registered to the eureka
 * service registry and uses feign clients.
 *
 * endpoints:
 * "/tasks", "........................ POST new task, GET all tasks"
 * "/tasks/{id}", "................... GET, PUT, Delete by id"
 * "/tasks/category={category}", ".... GET list of tasks by category"
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class TaskerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskerServiceApplication.class, args);
	}

}
