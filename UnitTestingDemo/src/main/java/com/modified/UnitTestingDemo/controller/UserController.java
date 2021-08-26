package com.modified.UnitTestingDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.modified.UnitTestingDemo.model.User;
import com.modified.UnitTestingDemo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
		
	@GetMapping("users")
	List<User> getUsers()
	{
		return userService.retriveAllUsers();
	}
	
	@GetMapping("user")
	String getUserTemp()
	{
		return userService.temp();
	}
	
	@GetMapping("user/{id}")
	User getUser(@PathVariable int id )
	{
		return userService.retriveUser(id);
	}
	
	
	@PostMapping("user")
	void createUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
}
