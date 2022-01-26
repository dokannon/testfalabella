package com.testfalabella.main.service;

import java.util.Base64;

import org.springframework.stereotype.Service;

import com.testfalabella.main.util.Decode;
import com.testfalabella.main.util.Encode;

@Service
public class EncodeServiceImpl implements IEncodeService {

	@Override
	public String setEnconde(String word) {
		String encodedString = null;
		Encode encode = new Encode();
		if (encode.isWordValid(word)) {
			encodedString = Base64.getEncoder().encodeToString(word.getBytes());
			System.out.println("palabra codificada " + encodedString);
		}
		return encodedString;
	}

	@Override
	public String getDecode(String codedWord) {
		Decode decode = new Decode();
		return decode.decode(codedWord);
	}

}
