package com.spring.hackathon.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.hackathon.domain.User;
import com.spring.hackathon.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	
	
	@Autowired
	UserRepository userRepository;
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}
	
}
