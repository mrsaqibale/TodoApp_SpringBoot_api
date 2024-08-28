package com.todo.dto;

import java.time.LocalDateTime;


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
