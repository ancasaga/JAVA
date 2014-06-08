package com.examples.ci;

import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class MessageRetriever {

	static final String WELCOME_REGULAR_MESSAGE = "Hola Mundo!";
	static final String WELCOME_US_MESSAGE = "Hello World!";

	public String getLocaleMessage(Locale locale) {
		String message = StringUtils.EMPTY;
		if (Locale.US == locale) {
			message = WELCOME_US_MESSAGE;
		}

		else {
			message = WELCOME_REGULAR_MESSAGE;
		}

		return message;
	}
}
