package com.modified.UnitTestingDemo.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	
	int id;
	String userName;
	String name;
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", name=" + name + "]";
	}
	
	public User() {
		super();
	}
	public User(int id, String userName, String name) {
		super();
		this.id = id;
		this.userName = userName;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
