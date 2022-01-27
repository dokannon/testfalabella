package com.testfalabella.main.service;

import java.util.Base64;

import org.springframework.stereotype.Service;

import com.testfalabella.main.util.Decode;
import com.testfalabella.main.util.Encode;

@Service
public class EncodeServiceImpl implements IEncodeService {

	@Override
	public String setEnconde(String word) throws Exception {
		String encodedString = null;
		Encode encode = new Encode();
		if (encode.isWordValid(word)) {
			encodedString = Base64.getEncoder().encodeToString(word.getBytes());
			System.out.println("palabra codificada " + encodedString);
		} else {
			throw new Exception();
		}
		return encodedString;
	}

	@Override
	public String getDecode(String codedWord) throws Exception {

		Decode decode = new Decode();
		return decode.decode(codedWord);

	}

}
