package com.proje.db.Impl;

import com.proje.db.DBConnection;

public class MysqlDBConnectionImpl implements DBConnection {

	@Override
	public void openConnection() {
		
		System.out.println("Mysql Veritabanin baglanildi.");
	}

	@Override
	public void closeConnection() {
		System.out.println("Mysql Veritabani baglantisi kapatildi..");

		
	}

}
