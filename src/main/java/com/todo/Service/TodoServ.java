package com.todo.Service;

import java.util.List;

import com.todo.dto.TodoDto;

public interface TodoServ {

    // create todo
    TodoDto createTodo(TodoDto TodoDto);


    // update todo
    TodoDto updateDto(TodoDto t);
    // delete todo of user
    // get all todos of user
    List<TodoDto> getalltodo();
    // get todo by id of user
    // get complete todo
    // get on priority todo 
    // get todo by search of user
}
