package com.spring.hackathon.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection="User123")
public class User {
	@Id
	private int userid;
	private String name;
	private String email;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int userid, String name, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
	}
	
	public User() {
		
	}
}
