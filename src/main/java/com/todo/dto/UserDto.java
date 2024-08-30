package com.todo.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private String name ;

    private String phoneNumber;

    private String imageName;
    private String imageType;
    private byte[] imageData;
    
    private String role;

    private LocalDateTime createdAt ;

    private LocalDateTime updatedAt;

    private boolean isLocked;

    private boolean isDeleted;

    private int loginCount;
    
    // private List<Todo> todo;
}
