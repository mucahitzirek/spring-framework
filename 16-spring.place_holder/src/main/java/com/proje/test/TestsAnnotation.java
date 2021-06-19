package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig2;
import com.proje.db.Database;

public class TestsAnnotation {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);

		Database database = applicationContext.getBean(Database.class);

		System.out.println("Username : " + database.getUsername());

		System.out.println("Password : " + database.getPassword());

		applicationContext.close();

	}

}
