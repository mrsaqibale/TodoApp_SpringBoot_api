package com.todo.payload;

import com.todo.entites.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserImageResponse {

    private User user;
    private byte[] bytes;
    
}
