package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.Database;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Database database = (Database) applicationContext.getBean("database");
		System.out.println("Url : " + database.getUrl());
		System.out.println("username : " + database.getUsername());
		System.out.println("Password : " + database.getPassword());

		applicationContext.close();
	}

}
