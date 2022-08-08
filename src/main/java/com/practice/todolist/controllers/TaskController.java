package com.practice.todolist.controllers;

import com.practice.todolist.models.Task;
import com.practice.todolist.repositories.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaskController {
//dependency Injection
    private final TaskRepository taskRepositoryDao;

    public TaskController(TaskRepository taskRepositoryDao) {
        this.taskRepositoryDao = taskRepositoryDao;
    }

    //    C.R.U.D
//    -------------------


//    Read.
    @GetMapping("/")
    public String viewAllTasks(Model model) {
        model.addAttribute("tasks", taskRepositoryDao.findAll());
        return "todo";
    }

//    Create.

//    Delete.

//    Update.


}
