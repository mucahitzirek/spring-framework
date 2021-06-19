package com.proje.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {

		DBConnection dbConnection = new DBConnection();

		List<String> list = Arrays.asList("min 5 connection", "max 100 connection", "cache 100 statement");

		dbConnection.setList(list);

		Map<String, String> map = new HashMap();

		map.put("min_connection", "5");
		map.put("max_connection", "10");

		dbConnection.setMaps(map);

		Properties properties = new Properties();

		properties.setProperty("user", "root");

		dbConnection.setProps(properties);
		dbConnection.openConnection();

		dbConnection.cloeseConection();
	}

}
