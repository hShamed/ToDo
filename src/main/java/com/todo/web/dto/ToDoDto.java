package com.todo.web.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
public class ToDoDto {
    private Long Id;
    private String text;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
