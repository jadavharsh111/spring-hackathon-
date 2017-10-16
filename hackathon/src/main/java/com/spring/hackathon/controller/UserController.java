package com.spring.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hackathon.domain.User;
import com.spring.hackathon.services.UserService;


@RestController
public class UserController {

		@Autowired
		UserService userService;
		
		@RequestMapping(value = "/user/adduser", method = RequestMethod.GET)
		public ResponseEntity <User> getMovieById(@RequestBody User user) {
	        userService.addUser(user);
	        return new ResponseEntity<User>( user, HttpStatus.CREATED );
	    }
}
