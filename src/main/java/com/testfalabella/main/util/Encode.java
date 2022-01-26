package com.testfalabella.main.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Encode {

	private static final String WORDREG = "[%a-zA-Z0-9\\p{P}\\p{S}\\s]*";

	public Boolean isWordValid(String word) {
		Pattern wordPatern = Pattern.compile(WORDREG, Pattern.CASE_INSENSITIVE);
		Matcher wordMatcher = wordPatern.matcher(word);

		if (!wordMatcher.matches()) {

			return false;
		}

		return true;
	}

}
