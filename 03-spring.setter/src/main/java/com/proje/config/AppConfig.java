package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppConfig {

	@Bean
	public DBConnection dbConnectionMethod() {

		DBConnection dbConnection = new DBConnection();

		dbConnection.setUrl("mysql:localhost8080");
		dbConnection.setUsername("aykanferhat");
		dbConnection.setPassword("213165");
		return dbConnection;
	}
}
