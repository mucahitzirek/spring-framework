package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection = (DBConnection) configurableApplicationContext.getBean("dbConnection");

		dbConnection.openConnection();

		dbConnection.closeConnection();

		configurableApplicationContext.close();

	}

}
