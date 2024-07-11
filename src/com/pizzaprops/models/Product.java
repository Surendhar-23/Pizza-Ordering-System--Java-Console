package com.pizzaprops.models;

import java.io.Serializable;

public class Product implements Serializable{
	private int productId;
	private String name;
	private double price;
	private String description;

	public Product(int productId, String name, double price, String description) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product ID: " + productId +
				"\nName: " + name +
				"\nPrice: $" + price +
				"\nDescription: " + description + "\n";
	}
}
