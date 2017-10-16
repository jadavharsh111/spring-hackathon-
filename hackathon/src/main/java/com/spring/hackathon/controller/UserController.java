package com.spring.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		@RequestMapping(value = "/user/adduser", method = RequestMethod.POST)
		public ResponseEntity <?> getMovieById(@RequestBody User user) {
	        userService.addUser(user);
	        return new ResponseEntity<String>("Success", HttpStatus.CREATED );
	    }
		
		@RequestMapping(value = "/repos/showrepo/delete/{id}", method = RequestMethod.GET)
	    public ResponseEntity <?> getMovieById(@PathVariable() int id) {
	        userService.deleteRepo(id);
	        return new ResponseEntity<String>("deleted", HttpStatus.CREATED );
	    }
}
