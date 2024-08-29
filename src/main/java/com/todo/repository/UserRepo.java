package com.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.todo.dto.UserDto;
import com.todo.entites.User;

public interface UserRepo extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.isDeleted = false AND u.isLocked = false")
    User findActiveUsers();

    @Query("SELECT u FROM User u WHERE u.id = :id AND u.isDeleted = false AND u.isLocked = false")
    User findActiveById(@Param("id") Long id);
}
