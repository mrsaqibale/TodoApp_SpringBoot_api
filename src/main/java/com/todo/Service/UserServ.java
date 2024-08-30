package com.todo.Service;

import java.util.List;

import com.todo.dto.UserDto;
import com.todo.entites.User;

public interface UserServ {

    // create user by admin or he is admin, or admin power
	UserDto createUser(UserDto userDto);

    // update profile by admin 
    UserDto updateUser(UserDto userDto);

    // show all the users 
    List<UserDto>  getAllUsers();

    // get user by id 
    UserDto getUserById(Long id);

    // soft del user 
    User deleteUser(Long id);

    // register user 

    // login user
	
	
}
