package com.examples.ci;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class MessageRetrieverTest {
	private MessageRetriever testInstance;

	@Test
	public void testGetFormatedTest() {
		testInstance = new MessageRetriever();
		String message = testInstance.getLocaleMessage(Locale.US);
		assertEquals(MessageRetriever.WELCOME_US_MESSAGE, message);

		message = testInstance.getLocaleMessage(Locale.JAPAN);
		assertEquals(MessageRetriever.WELCOME_REGULAR_MESSAGE, message);

	}

}
