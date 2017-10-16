package com.spring.hackathon.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hackathon.domain.User;
import com.spring.hackathon.repository.UserRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Index;


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
	
	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		return userRepository.findOne((long) id);
		
	}

	@Override
	public List findAllusers() {
		// TODO Auto-generated method stub
		List<User> user = new ArrayList<>();
        user.addAll((Collection<? extends User>) userRepository.findAll());
        return user;
	}

	@Override
	public void updateUser(User user) {
		 userRepository.save(user);
		
	}
}
