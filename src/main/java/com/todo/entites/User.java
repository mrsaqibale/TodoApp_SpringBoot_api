package com.todo.entites;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    private String phoneNumber;

    @Column(length = 1000)
    private String profilePicture;
    
    private String role;

    @Column(updatable = false)
    private LocalDateTime createdAt ;

    private LocalDateTime updatedAt;

    private boolean isLocked;

    private boolean isDeleted;

    private int loginCount;
    
    @OneToMany(mappedBy = "user")
    private List<Todo> todo;
}
