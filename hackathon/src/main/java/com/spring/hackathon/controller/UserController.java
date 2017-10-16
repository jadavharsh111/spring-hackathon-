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
		
		@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity <?> getMovieById(@PathVariable() int id) {
	        userService.deleteRepo(id);
	        return new ResponseEntity<String>("deleted", HttpStatus.CREATED );
	    }
		
		@RequestMapping(value = "/user/find/{id}", method = RequestMethod.GET)
	    public ResponseEntity <User> findeOneuser(@PathVariable() int id) {
	        User userfound = userService.findUser(id);
	        return new ResponseEntity<User>(userfound, HttpStatus.CREATED );
	    }
		
		@RequestMapping(value = "user/showall", method = RequestMethod.GET)
	    public ResponseEntity <List<User> > getMovieById() {
	        ArrayList<User> userList = (ArrayList<User>) userService.findAllusers();
	        return new ResponseEntity<List<User>>( userList, HttpStatus.CREATED );
	    }
		
		@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User user) {
	        System.out.println("Updating User " + id);
	        
	        User currentUser = userService.findUser(id);
	        
	        if (currentUser==null) {
	            System.out.println("User with id " + id + " not found");
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }

	        currentUser.setName(user.getName());
	        currentUser.setUserid(user.getUserid());
	        currentUser.setEmail(user.getEmail());
	        
	        userService.updateUser(currentUser);
	        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	    }
}
