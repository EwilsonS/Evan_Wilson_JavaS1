package com.trilogyed.tasker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> routes() {
        Map<String, String> routes = new LinkedHashMap<>();
        routes.put("/tasks", "........................ POST new task, GET all tasks");
        routes.put("/tasks/{id}", "................... GET, PUT, Delete by id");
        routes.put("/tasks/category={category}", ".... GET list of tasks by category");
        return routes;
    }
}
