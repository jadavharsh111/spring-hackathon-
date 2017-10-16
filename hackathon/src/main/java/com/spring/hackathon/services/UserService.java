package com.spring.hackathon.services;

import com.spring.hackathon.domain.User;

public interface UserService {
		
	public void addUser(User user);

	public void deleteRepo(int id);
}
