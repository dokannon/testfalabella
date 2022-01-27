package com.testfalabella.main.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.testfalabella.main.util.Decode;
import com.testfalabella.main.util.Encode;

@SpringBootTest
class EncodeServiceImplTest {

	private static final String ENCODED_WORD = "9Mel";
	private static final String DECODED_WORD = "OU1lbA==";
	@InjectMocks
	EncodeServiceImpl service;

	@DisplayName("Encode Should be ok")
	@Test
	void encodeShouldBeOk() {
		Encode encode = new Encode();
		assertEquals(true, encode.isWordValid(ENCODED_WORD));

	}

	@DisplayName("Encode Should be ok")
	@Test
	void decodeShouldBeOk() {
		Decode decode = new Decode();
		assertEquals("OU1lbA==", decode.decode(DECODED_WORD));

	}

}
