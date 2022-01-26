package com.testfalabella.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testfalabella.main.service.EncodeServiceImpl;

@RestController
@RequestMapping("/api")
public class EncodeController {
	
	private EncodeServiceImpl encodeServiceImpl;
	
	public EncodeController(EncodeServiceImpl encodeServiceImpl) {
		 this.encodeServiceImpl =encodeServiceImpl;
	}

	@GetMapping("/encode")
	public ResponseEntity<?> setEnconde(@RequestParam(name = "word") String word) {
		if (word.isEmpty() || word.isBlank() || null == word) {
			return new ResponseEntity<>("palabra no es valida", HttpStatus.BAD_REQUEST);
		}
		if (null != encodeServiceImpl.setEnconde(word)) {

			return new ResponseEntity<>("Falabella es el mejor retail", HttpStatus.OK);
		}

		return new ResponseEntity<>("Error en la palabra", HttpStatus.CONFLICT);

	}

	@GetMapping("/decode")
	public ResponseEntity<?> getDecode(@RequestParam(name = "codedword") String codedWord) {
		if (null != encodeServiceImpl.getDecode(codedWord)) {
			return new ResponseEntity<>("palabra riginal : "+encodeServiceImpl.getDecode(codedWord), HttpStatus.OK);
		}

		return new ResponseEntity<>("Palabra no encontrada", HttpStatus.CONFLICT);
	}

}
