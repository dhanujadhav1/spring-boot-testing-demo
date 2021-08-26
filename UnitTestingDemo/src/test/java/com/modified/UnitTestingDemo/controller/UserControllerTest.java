package com.modified.UnitTestingDemo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.modified.UnitTestingDemo.model.User;
import com.modified.UnitTestingDemo.service.UserService;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@WebMvcTest(UserController.class)
public class UserControllerTest {

	
	@MockBean
	private UserService userService;
	  
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void test() throws Exception
	{
		when(userService.temp()).thenReturn("HII23");
		
		RequestBuilder request = MockMvcRequestBuilders.get("/user")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("HII23"))
				.andReturn();
		
		
//		String actual=result.getResponse().getContentAsString();
//		String expected="HII";
//		assertEquals(expected, actual);
		
		
		
	}
	
	
}
