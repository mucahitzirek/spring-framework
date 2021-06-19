package com.proje.model;

public class Product {

	private String name;

	private double price;

	private int avaible;

	private String category;

	public Product() {

	}

	public Product(String name, double price, int avaible, String category) {
		this.name = name;
		this.price = price;
		this.avaible = avaible;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", avaible=" + avaible + ", category=" + category + "]";
	}

}
