package com.todo.Service.imp;

import java.util.List;

import com.todo.Service.UserServ;
import com.todo.dto.UserDto;

public class UserServImp implements UserServ{

    @Override
    public UserDto createUser(UserDto userDto) {
        
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public List<UserDto> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    @Override
    public UserDto getUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public void UserDelete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'UserDelete'");
    }

}
