package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
import com.proje.db.Database;

@Configuration
public class AppConfig {

	@Bean
	public DBConnection dbConnection() {
		Database database = new Database("mysql:localhost", "mucahitzirek", "213165");
		DBConnection dbConnection = new DBConnection();

		dbConnection.setDatabase(database);

		return dbConnection;
	}
}
