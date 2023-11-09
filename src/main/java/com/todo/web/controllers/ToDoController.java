package com.todo.web.controllers;

import com.todo.web.dto.ToDoDto;
import com.todo.web.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/todo")
    public String listToDos(Model model) {
        List<ToDoDto> toDos = toDoService.findAllToDos();

        model.addAttribute("toDos", toDos);

        return "toDos-list";
    }
}
