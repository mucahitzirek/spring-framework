package com.proje.test;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;

public class TestAnnotation {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		String message = applicationContext.getMessage("failure.login.message", null, Locale.US);
		System.out.println(message);

		applicationContext.close();

	}

}
