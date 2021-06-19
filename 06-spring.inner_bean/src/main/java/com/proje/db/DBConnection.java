package com.proje.db;

public class DBConnection {

	private Database database;

	public void openConnection() {
		System.out.println("Url : " + this.database.getUrl());
		System.out.println("Username : " + this.database.getUsername());
		System.out.println("Password: " + this.database.getPassword());

		System.out.println("Baglanti yapildi.");

	}

	public void closeConnection() {
		System.out.println("Baglanti kapatildi.");
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public Database getDatabase() {
		return database;
	}

}
