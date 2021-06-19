package com.proje.db;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DBConnection {

	private String username;

	private String password;

	private List<String> list;

	private Map<String, String> maps;

	private Properties props;

	public void openConnection() {
		System.out.println("Username : " + username);
		System.out.println("Psasword : " + password);

		System.out.println("List icindekiler : ");

		for (String ozellik : list) {
			System.out.println("\t - " + ozellik);
		}

		System.out.println("Map icindekiler.");

		Set<String> keys = this.maps.keySet();

		for (String key : keys) {
			System.out.println("\t - " + key + " : " + maps.get(key));
		}
		System.out.println("Props icindekiler : ");

		Set<String> keyProps = this.props.stringPropertyNames();

		for (String propsKey : keyProps) {
			System.out.println("\t - " + propsKey + " : " + this.props.getProperty(propsKey));
		}

		System.out.println("Baglanti yaplidi.");
	}

	public void cloeseConection() {
		System.out.println("Baglanti kapandi.");
	}

	public DBConnection() {

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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

}
