package com.proje.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

		DBConnection dbConnection = (DBConnection) beanFactory.getBean("dbConnection");

		dbConnection.openConnection();

		dbConnection.closeConnection();

		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection2 = abstractApplicationContext.getBean("dbConnection", DBConnection.class);

		dbConnection2.openConnection();

		dbConnection2.closeConnection();
		abstractApplicationContext.close();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		DBConnection dbConnection3 = (DBConnection) applicationContext.getBean("dbConnection");

		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection4 = (DBConnection) configurableApplicationContext.getBean("dbConnection");

		dbConnection4.openConnection();

		dbConnection4.closeConnection();

		configurableApplicationContext.close();

	}

}
