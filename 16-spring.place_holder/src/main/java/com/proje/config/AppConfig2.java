package com.proje.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.proje.db.Database;

@Configuration
@PropertySources({ @PropertySource("classpath:db.properties")

})
public class AppConfig2 {
	
	@Autowired
	private Environment environment;

	@Bean
	public Database database() {
		
		String url = this.environment.getProperty("url");
		String username = this.environment.getProperty("username");
		String password = this.environment.getProperty("password");
		
		Database database = new Database(url, username, password);
		
		return database;
	}

}
