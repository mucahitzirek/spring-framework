package com.proje.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
import com.proje.postProcesor.PostProcesor;

@Configuration
public class AppConfig {

	@Bean(initMethod = "validation", destroyMethod = "closeConnection")
	public DBConnection dbConnection() {

		DBConnection dbConnection = new DBConnection();
		dbConnection.setUrl("mysql:localhos8080");
		dbConnection.setUsername("mucahitzirek");
		dbConnection.setPassword("12345");
		return dbConnection;
	}

	@Bean
	public BeanPostProcessor beanPostProcessor() {

		return new PostProcesor();
	}

}
