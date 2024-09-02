package com.todo.Service;

import com.todo.dto.TodoDto;

public interface TodoServ {

    // create todo
    TodoDto createTodo(TodoDto TodoDto);


    // update todo
    TodoDto updateDto(TodoDto todoDto);
    // delete todo of user
    // get all todos of user
    // get todo by id of user
    // get complete todo
    // get on priority todo 
    // get todo by search of user
}
