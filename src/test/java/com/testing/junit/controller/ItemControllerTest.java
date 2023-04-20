package com.testing.junit.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(ItemController.class)	
	public class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;
	


	
	@Test
	public void itemTest_basic() throws Exception{
		
	RequestBuilder requestBuilder = MockMvcRequestBuilders
			.get("/items")
			.accept(org.springframework.http.MediaType.APPLICATION_JSON);


		MvcResult result= mockMvc.perform(requestBuilder).andDo(print())
				.andExpect(status().isOk())
			
				.andExpect(MockMvcResultMatchers.content().json("{\"id\":1,\"name\":\"bat\",\"price\":10,\"quantity\":100}")).andReturn();
		
	}
		
	
	
	
	
	
}
