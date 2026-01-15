package com.julio.taskmanager.controller;

import com.julio.taskmanager.model.Task;
import com.julio.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.create(task);
    }
}

@PutMapping("/{id}")
public Task update(@PathVariable Long id, @RequestBody Task task) {
    return service.update(id, task);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
    service.delete(id);
}

