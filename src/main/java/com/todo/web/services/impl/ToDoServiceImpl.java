package com.todo.web.services.impl;

import com.todo.web.dto.ToDoDto;
import com.todo.web.models.ToDo;
import com.todo.web.repositories.ToDoRepository;
import com.todo.web.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public List<ToDoDto> findAllToDos() {
        List<ToDo> toDos = toDoRepository.findAll();
        return toDos.stream().map((toDo) -> mapToToDoDto(toDo)).collect(Collectors.toList());
    }

    private ToDoDto mapToToDoDto(ToDo toDo) {
        ToDoDto toDoDto = ToDoDto.builder()
                .Id(toDo.getId())
                .text(toDo.getText())
                .createdAt(toDo.getCreatedAt())
                .updatedAt(toDo.getUpdatedAt())
                .build();

        return toDoDto;
    }
}
