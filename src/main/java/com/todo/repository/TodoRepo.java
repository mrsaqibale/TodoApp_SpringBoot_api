package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entites.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long>{

    // get todo of user with id uncomplete

    // get all todo of user uncomplete

    // get complete todo of user with id 

    // get complete todo of user all 

    // get todo of today 
    
}
