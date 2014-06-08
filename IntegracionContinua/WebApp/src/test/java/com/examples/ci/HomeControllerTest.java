package com.examples.ci;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;


public class HomeControllerTest {
	private static final String HOME_VIEW_NAME = "home";

	private static final String FORMATED_DATE = "FORMATED_DATE"; 

	@Mock
	private MessageRetriever dateRetriever;

	private static Locale locale;
	
	@Mock
	Model model;
	
	@InjectMocks
	private HomeController testInstance;

	@Before
	public void setUp() throws Exception {
		locale = Locale.US;
		testInstance = new HomeController();
		MockitoAnnotations.initMocks(this);
		Mockito.when(dateRetriever.getLocaleMessage(locale)).thenReturn(FORMATED_DATE);
	}

	@Test
	public void testHome() {
		String returnedString = testInstance.home(locale, model);
		assertEquals(HOME_VIEW_NAME, returnedString);
		Mockito.verify(model).addAttribute(HomeController.SERVER_TIME, FORMATED_DATE);
	}

}
