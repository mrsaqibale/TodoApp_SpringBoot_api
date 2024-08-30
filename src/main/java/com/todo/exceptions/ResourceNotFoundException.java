package com.todo.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
    
    private String resource ;

    private String field ;

    private Long id;

    // if data not found in table 
    public ResourceNotFoundException(String r, String f , Long id){
        super(String.format("%s not found with %s: %s",r, f, id));
        this.resource = r;
        this.field = f;
        this.id = id;
    }

    // if username not found in user at login
    public ResourceNotFoundException(String r, String f ){
        super(String.format("%s not found with username: %s",r, f));
        this.resource = r;
        this.field = f;
    }

}
