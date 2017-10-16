package com.spring.hackathon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hackathon.domain.User;
import com.spring.hackathon.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	
	
	@Autowired
	UserRepo userRepository;
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	@Override
	public void deleteRepo(int id) {
		
		userRepository.delete((long) id);
		
	}
	
}
