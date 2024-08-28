package com.todo.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodoDto {

    private Long id;

    private String title;

    private String description;

    private boolean isCompleted;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;

    private boolean isDeleted;

    private int priority;

    private String tag;

    // private User user;
}
