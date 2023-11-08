package com.todo.web.services;

import com.todo.web.dto.ToDoDto;

import java.util.List;

public interface ToDoService {
    List<ToDoDto> findAllToDos();
}
