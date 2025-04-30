package todoApp.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoApp.example.model.Task;
import todoApp.example.repository.TaskRepository;

//import com.todoapp.repository.TaskRepository;


@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public List<Task> getAllTasks() { return repo.findAll(); }

    public Task addTask(Task task) { return repo.save(task); }

    public Optional<Task> getTaskById(String id) { return repo.findById(id); }

    public Task updateTask(Task task) { return repo.save(task); }

    public void deleteTask(String id) { repo.deleteById(id); }
}
