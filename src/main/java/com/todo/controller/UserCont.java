package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.Service.UserServ;
import com.todo.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserCont {

    @Autowired
    private UserServ userServ;

    // create user by admin
    @PostMapping("/user")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto userdDto2 = this.userServ.createUser(userDto);
        return new ResponseEntity<>(userdDto2, HttpStatus.CREATED);
    }

    // get user by id only active for admin only
    @GetMapping("/user/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id){
        UserDto userDto = this.userServ.getUserById(id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

        // get all users only active for admin only
        @GetMapping("/user")
        public ResponseEntity<List<UserDto>> getUsers(){
            List<UserDto> userDtos = this.userServ.getAllUsers();
            return new ResponseEntity<>(userDtos, HttpStatus.FOUND);
        }
}
