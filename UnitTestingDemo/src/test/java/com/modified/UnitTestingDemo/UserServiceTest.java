package com.modified.UnitTestingDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.modified.UnitTestingDemo.dao.UserDao;
import com.modified.UnitTestingDemo.model.User;
import com.modified.UnitTestingDemo.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	public UserDao userDao;
	
	@InjectMocks
	UserService userService;
	
	@Test
	void getUserTest()
	{
		when(userDao.temp()).thenReturn("HII23");
		
	
		assertEquals("HII23",userService.temp());
		
		
	}
	
}
