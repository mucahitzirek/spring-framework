package com.proje.db;

public class DBConnection {

	private String url;

	private String username;

	private String password;

	@SuppressWarnings("unused")
	private void validation() {

		if (this.url == null || this.username == null || this.password == null) {
			System.out.println("Hata girilen deger Null.");
		
			throw new NullPointerException("Veritabani bilgileri yanlıs.");
		
		} else {
			System.out.println("Dogrulama basarili bir sekilde gerceklestirildi.");
		}

	}

	public void openConnection() {

		System.out.println("Baglanti acildi.");
	}

	public void closeConnection() {
		System.out.println("Baglanti kapatildi.");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DBConnection() {
	}

}
