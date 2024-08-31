package com.todo.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthResponse {
    
    private String msg; 

    private String token;

    private boolean flag;

    // send token with flag 
    public AuthResponse(String token , boolean flag){
        this.token = token;
        this.flag = flag;
    }
    public AuthResponse (boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

}
