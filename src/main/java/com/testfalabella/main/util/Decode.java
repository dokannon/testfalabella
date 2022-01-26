package com.testfalabella.main.util;

import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public class Decode {

	public String decode(String encodedString) {
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decodedBytes);
		return decodedString;
	}
	
}
