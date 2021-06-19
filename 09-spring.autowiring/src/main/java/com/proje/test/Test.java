package com.proje.test;

import com.proje.db.DBConnection;
import com.proje.db.Database;

public class Test {


	public static void main(String[] args) {
		Database database = new Database("mysql", "root", "213165");
		DBConnection dbConnection = new DBConnection();

		dbConnection.setDatabase(database);
		
		dbConnection.openConnection();

		dbConnection.closeConnection();

	}

}
