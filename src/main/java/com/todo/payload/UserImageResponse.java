package com.todo.payload;


import com.todo.dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserImageResponse {

    private UserDto user;
    private byte[] bytes;
    
}
