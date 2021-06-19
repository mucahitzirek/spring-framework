package com.proje.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.proje.db.Database;

@Configuration
@PropertySource(value = "db.properties")
public class AppConfig {

	@Value(value = "${url}")
	private String url;

	@Value(value = "${username}")
	private String username;

	@Value(value = "${password}")
	private String password;

	@Bean
	public Database database() {

		Database databse = new Database();
		databse.setUrl(this.url);
		databse.setUsername(this.username);
		databse.setPassword(this.password);

		return databse;

	}

}
