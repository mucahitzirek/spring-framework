package com.proje.dbConnection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proje.model.Database;

@Component
public class DBConnection {

	@Autowired
	private Database database;

	public void openConnection() {

		System.out.println("Baglanti acildi.");

	}

	public void closeConnection() {
		System.out.println("Baglanti kapatildi.");
	}

	public void getDBInfo() {
		System.out.println("Username : " + database.getUsername());
		System.out.println("Password : " + database.getPassword());
		System.out.println("URL : " + database.getUrl());
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

}
