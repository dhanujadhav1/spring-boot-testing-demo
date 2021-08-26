package com.modified.UnitTestingDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.modified.UnitTestingDemo.dao.UserDao;
import com.modified.UnitTestingDemo.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public String temp()
	{
		return userDao.temp();
	}



	
	public List<User> retriveAllUsers()
	{
		return userDao.getAllUser();
	}
	
	
	public User retriveUser(int id)
	{
		return userDao.getUser(id);
	}
	
	public void addUser(User user)
	{
		userDao.addUser(user);
	}
}
