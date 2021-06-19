package com.proje.db;

import org.springframework.beans.factory.annotation.Required;

public class DBConnection {

	private String url;

	private String username;

	private String password;

	public void openConnection() {
		System.out.println("Url : " + url);
		System.out.println("Username : " + username);
		System.out.println("Password: " + password);
		
		System.out.println("Baglanti acildi.");
		
	}

	public void closeConnection() {
		System.out.println("Baglanti kapatildi.");
	}

	public String getUrl() {
		return url;
	}
	
	@Required
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

	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
