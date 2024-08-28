package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entites.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
