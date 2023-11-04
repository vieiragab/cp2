package br.com.fiap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.model.Task;
import br.com.fiap.repository.TaskRepository;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long taskId, Task updatedTask) {
        updatedTask.setId(taskId);
        return taskRepository.save(updatedTask);
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}