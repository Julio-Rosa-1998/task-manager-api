package com.julio.taskmanager.service;

import com.julio.taskmanager.model.Task;
import com.julio.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task create(Task task) {
        return repository.save(task);
    }

    public List<Task> findAll() {
        return repository.findAll();
    }
}
public Task update(Long id, Task Task) {
    Task existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
existing.setTitle(Task.getTitle());
    existing.setDescription(Task.getDescription());
    existing.setStatus(Task.getStatus());
    return repository.save(existing);
}

    public void delete(Long id) {
        repository.deleteById(id);
    }
