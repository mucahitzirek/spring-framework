package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.proje.db.DBConnection;

@Configuration
public class AppConfig {

	@Bean(initMethod = "validation")
	public DBConnection dbConnection() {

		DBConnection dbConnection = new DBConnection();
		dbConnection.setUrl("mysql:localhos8080");
		dbConnection.setUsername("mucahitzirek");

		return dbConnection;
	}

}
