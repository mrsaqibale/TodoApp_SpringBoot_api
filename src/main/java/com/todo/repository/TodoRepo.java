package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entites.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long>{

}
