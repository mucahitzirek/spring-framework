package com.proje.testSpring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.Database;

public class TestSpring {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Database database = applicationContext.getBean("veritabani", Database.class);

		database.connection();
		database.closeConnection();

		applicationContext.close(); 

	}
}
