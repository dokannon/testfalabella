package com.testfalabella.main.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.testfalabella.main.service.EncodeServiceImpl;

@WebMvcTest(EncodeController.class)
class EncodeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EncodeServiceImpl encodeServiceImpl;
	@DisplayName("Encode Should Be Ok")
	@Test
	public void encodeShouldBeOk() throws Exception {
		when(encodeServiceImpl.setEnconde("9Mel")).thenReturn("Falabella es el mejor retail");
		
		mockMvc.perform(get("/api/encode?word=9Mel").contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")));
		
		verify(encodeServiceImpl).setEnconde("9Mel");
		
	}
	
	@DisplayName("Decode Should Be Ok")
	@Test
	public void decodeShouldBeOk() throws Exception {
		when(encodeServiceImpl.getDecode("OU1lbA==")).thenReturn("9Mel");
		
		mockMvc.perform(get("/api/decode?codedword=OU1lbA==").contentType(MediaType.valueOf("text/plain;charset=UTF-8")))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.valueOf("text/plain;charset=UTF-8")));
		
		
	}

}
