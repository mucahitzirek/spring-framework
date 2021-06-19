package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
import com.proje.db.Database;

@Configuration
public class AppConfig {

	@Bean
	public Database database() {
		Database database = new Database("mysql:localhost", "mucahitzirek", "213165");

		return database;
	}

	@Bean
	public DBConnection dbConnection() {

		DBConnection dbConnection = new DBConnection();

		dbConnection.setDatabase(this.database());

		return dbConnection;
	}
}
