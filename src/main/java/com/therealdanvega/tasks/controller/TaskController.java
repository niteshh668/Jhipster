package com.therealdanvega.tasks.controller;

import com.therealdanvega.tasks.domain.Task;
import com.therealdanvega.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping
    public Iterable<Task> list(){
        return taskService.list();
    }
    @PostMapping("/save")
    public  Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
