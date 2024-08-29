package com.todo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApiApplication.class, args);
	}

	// add model mapper bean 
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
