package com.spring.hackathon.services;

import com.spring.hackathon.domain.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface UserService {
		
	public void addUser(User user);

	public void deleteRepo(int id);

	public List<User> findAllusers();

	public User findUser(int id);
	
	public void updateUser(User user);
}
