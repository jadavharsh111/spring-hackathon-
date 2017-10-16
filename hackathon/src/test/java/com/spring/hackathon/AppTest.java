package com.spring.hackathon;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.net.URI;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;
import com.spring.hackathon.domain.User;


public class AppTest {

	public static final String USER_SERVICE_URI = "http://localhost:8080";
	
	/* GET */
	@SuppressWarnings("unchecked")
	private static void listAllUsers(){
		System.out.println("To test listAllUsers API");
		
		RestTemplate restTemplate = new RestTemplate();
		List<HashMap<String, Object>> usersMap = restTemplate.getForObject(USER_SERVICE_URI+"/user/", List.class);
		
		if(usersMap!=null){
			for(HashMap<String, Object> map : usersMap){
	            System.out.println("User : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
	        }
		}
		else
		{
			System.out.println("No user found");
		}
	}
	
	/* GET */
	private static void getUser(){
		System.out.println("To test getUser API");
		RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(USER_SERVICE_URI+"/user/1", User.class);
        System.out.println(user);
	}
	
	/* GET */
	private static void getAllUsers(){
		System.out.println("To test all getUser API");
		RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(USER_SERVICE_URI+"/user/", User.class);
        System.out.println(user);
	}
	
	/* POST */
    private static void createUser() {
		System.out.println("To test create User API");
    	RestTemplate restTemplate = new RestTemplate();
        User user = new User();
        URI uri = restTemplate.postForLocation(USER_SERVICE_URI+"/user/", user, User.class);
        System.out.println("Location : "+uri.toASCIIString());
    }

    /* PUT */
    private static void updateUser() {
		System.out.println("To test update User API");
        RestTemplate restTemplate = new RestTemplate();
        User user  = new User();
        restTemplate.put(USER_SERVICE_URI+"/user/1", user);
        System.out.println(user);
    }

    /* DELETE */
    private static void deleteUser() {
		System.out.println("To test delete User API");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(USER_SERVICE_URI+"/user/3");
    }


    /* DELETE */
    private static void deleteAllUsers() {
		System.out.println("To test all delete Users API");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(USER_SERVICE_URI+"/user/");
    }

    public static void main(String args[]){
		listAllUsers();
		
		getUser();
		createUser();
		listAllUsers();
		
		getAllUsers();
		createUser();
		listAllUsers();
		
		updateUser();
		listAllUsers();
		
		deleteUser();
		listAllUsers();
		
		deleteAllUsers();
		listAllUsers();
    }
}