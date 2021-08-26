package com.modified.UnitTestingDemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.modified.UnitTestingDemo.model.User;

@Component
public class UserDao {

	private static List<User> users= new ArrayList<>();
	private static int userId=4;
	
	static {
		users.add(new User(1,"James_d", "James"));
		users.add(new User(2,"Johnk","John K"));
		users.add(new User(3,"Ruma_selvam"," Ruma Selvam"));
		users.add(new User(4,"surya_l", "Suryakant"));
	}
	
	
	public List<User> getAllUser()
	{
		return users;
	}
	
	public User getUser(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
				return user;
		}
		return null;
	}
	
	public void addUser(User user) {
		
		if(user.getId()==0)
		{	++userId;
		user.setId(userId);
		}
		users.add(user);
		
	}

	public String temp() {
		// TODO Auto-generated method stub
		return "HI";
	}
	
	
}
