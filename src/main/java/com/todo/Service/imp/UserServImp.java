package com.todo.Service.imp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.Service.UserServ;
import com.todo.dto.UserDto;
import com.todo.entites.User;
import com.todo.exceptions.ResourceNotFoundException;
import com.todo.repository.UserRepo;

@Service
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

    // find all users only active for admin only
    @Override
    public List<UserDto> getAllUsers() {
            List<User> users = this.userRepo.findActiveUsers();
            List<UserDto> userDtos = users.stream().map((user) -> this.modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
            return userDtos;
    }

    // find user by id only active user
    @Override
    public UserDto getUserById(Long id) {
        try {            
            User user = this.userRepo.findActiveById(id);
            return this.modelMapper.map(user,UserDto.class);
        } catch (Exception e) {
            throw new ResourceNotFoundException("User", "id", id);
        }
    }

    @Override
    public User deleteUser(Long id) {
        try {            
            User user = this.userRepo.findActiveById(id);
            user.setDeleted(true);
            return this.userRepo.save(user);
        } catch (Exception e) {
            throw new ResourceNotFoundException("User", "id", id);
        }
    }

}
