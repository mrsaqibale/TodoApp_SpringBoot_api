package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.Service.UserServ;
import com.todo.dto.UserLog;

@RestController
@RequestMapping("/auth")
public class UserLogCont {
    
    @Autowired
    private UserServ userServ;

    @PostMapping("/register")
    public UserLog register(@RequestBody UserLog user) {
        this.userServ.registerUser(user);
        return user;
    }
}