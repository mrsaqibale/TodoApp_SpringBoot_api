package com.todo.Service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.todo.entites.User;
import com.todo.exceptions.ResourceNotFoundException;
import com.todo.repository.UserRepo;

@Service
public class CustomUserDetailServImp implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User user = this.userRepo.findActiveByUsername(username);
            return user;
        } catch (Exception e) {
            throw new ResourceNotFoundException("User", username);
        }

	}

}
