package com.proje.test;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {

		DBConnection dbConnection = new DBConnection();
		
		dbConnection.setUrl("mysql:localhost8080");
		dbConnection.setUsername("aykanferhat");
		dbConnection.setPassword("213165");
		dbConnection.openConnection();

		dbConnection.closeConnection();
	}

}
