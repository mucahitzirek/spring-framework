package com.proje.db;

public class DBConnection {

	private Database database;

	private Properties properties;

	public void openConnection() {
		System.out.println("Url : " + this.database.getUrl());
		System.out.println("Username : " + this.database.getUsername());
		System.out.println("Password: " + this.database.getPassword());

		System.out.println("Properties bilgileri : ");

		System.out.println("Property1 : " + properties.getProperty1());
		System.out.println("Property2 : " + properties.getProperty2());

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

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
