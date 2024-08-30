package com.todo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.todo.Service.UserServ;
import com.todo.dto.UserDto;
import com.todo.entites.User;
import com.todo.payload.DeleteResponse;
import com.todo.payload.UserImageResponse;

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
    public ResponseEntity<UserImageResponse> getUserById(@PathVariable Long id){
        UserDto userDto = this.userServ.getUserById(id);
        byte[] img = userDto.getImageData();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(userDto.getImageType()));
        // return ResponseEntity.ok().contentType(MediaType.valueOf(userDto.getImageType())).body(img);
        return new ResponseEntity<UserImageResponse>(new UserImageResponse(userDto, img),headers, HttpStatus.FOUND);
    }

    // get all users only active for admin only
    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> getUsers(){
        List<UserDto> userDtos = this.userServ.getAllUsers();
        return new ResponseEntity<>(userDtos, HttpStatus.FOUND);
    }
    
    // soft delete by only admin 
    @DeleteMapping("/user/{id}")
    public ResponseEntity<DeleteResponse> deleteUser(@PathVariable Long id){
        User user = this.userServ.deleteUser(id);
        DeleteResponse dr = new DeleteResponse(true, user.getUsername());
        return new ResponseEntity<DeleteResponse>(dr, HttpStatus.OK); 
    }

    // upload image by username get from token 
    @PutMapping("/user/image")
    private ResponseEntity<?> uploadImage(MultipartFile file){
        this.userServ.uploadImage(file);
        return  ResponseEntity.ok("uploaded");
    }

}
