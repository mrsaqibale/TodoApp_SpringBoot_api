package com.todo.Service.imp;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.todo.Service.UserServ;
import com.todo.dto.UserDto;
import com.todo.entites.User;
import com.todo.repository.UserRepo;

public class UserServImp implements UserServ{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;


    // create user for the admin only with role of admin
    @Override
    public UserDto createUser(UserDto userDto) {
        // set password encoder
        User user = modelMapper.map(userDto, User.class);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        user.setRole("ADMIN");
        user.setDeleted(false);
        user.setLocked(false);
        user.setLoginCount(0);
        user.setProfilePicture("default.png");
        User user2 = this.userRepo.save(user);
        return this.modelMapper.map(user2, UserDto.class);
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
