package com.todo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.todo.payload.ExceptionResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleResourceNotFoundException(ResourceNotFoundException e) {
        String msg = e.getMessage();
        ExceptionResponse ex = new ExceptionResponse(msg , false, 404);
        return new ResponseEntity<ExceptionResponse>(ex, HttpStatus.NOT_FOUND);
    }
}
