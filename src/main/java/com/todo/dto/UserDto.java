package com.todo.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private Long id;

    private String username;

    private String email;

    private String password;

    private String phoneNumber;

    private String profilePicture;
    
    private String role;

    private LocalDateTime createdAt ;

    private LocalDateTime updatedAt;

    private boolean isLocked;

    private boolean isDeleted;

    private int loginCount;
    
    // private List<Todo> todo;
}
