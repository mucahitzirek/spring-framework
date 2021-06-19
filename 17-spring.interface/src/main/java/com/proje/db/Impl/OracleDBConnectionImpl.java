package com.proje.db.Impl;

import com.proje.db.DBConnection;

public class OracleDBConnectionImpl implements DBConnection {

	@Override
	public void openConnection() {

		System.out.println("Oracle Veritabanin baglanildi.");
	}

	@Override
	public void closeConnection() {
		System.out.println("Oracle Veritabani baglantisi kapatildi..");

	}
}
