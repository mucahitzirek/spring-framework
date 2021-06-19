package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.dbConnection.DBConnection;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection = (DBConnection) applicationContext.getBean("DBConnection");

		dbConnection.getDBInfo();

		
		dbConnection.openConnection();

		dbConnection.closeConnection();

		applicationContext.close();

	}

}
