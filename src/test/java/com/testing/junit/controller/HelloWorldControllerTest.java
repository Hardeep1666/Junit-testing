package com.testing.junit.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void helloWorld_basic() throws Exception
	{
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/hello")
				.accept(org.springframework.http.MediaType.APPLICATION_JSON);
		

			MvcResult result= mockMvc.perform(requestBuilder)
					.andExpect(status().isOk() )
					.andReturn();
	
		
		//call  "/hello"  not a java thing it is a uri so we need MockMvc
		// verify "hello World"
	
			assertEquals("Hello world",result.getResponse().getContentAsString());
		
	}
	
}
