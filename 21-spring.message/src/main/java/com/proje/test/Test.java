package com.proje.test;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Locale locale = new Locale("tr", "TR");

		String message = applicationContext.getMessage("failure.login.message", null, locale);

		System.out.println(message);

		applicationContext.close();

	}

}
