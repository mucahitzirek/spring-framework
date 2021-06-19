package com.proje.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
import com.proje.db.Database;
import com.proje.db.Properties;

@Configuration
public class AppConfig {

	@Bean(name = "database")
	public Database database() {

		Database database = new Database("mysql:localhos", "username", "12345");

		return database;
	}

	@Bean(name = "properties")
	public Properties properties() {
		Properties properties = new Properties("min 5 connection", "max 100 connection");

		return properties;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public DBConnection dbConnection() {

		DBConnection dbConnection = new DBConnection();

		return dbConnection;
	}

}
