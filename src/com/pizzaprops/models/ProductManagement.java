package com.pizzaprops.models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ProductManagement {
	
	public static HashMap<Integer, Product> products = new HashMap<>();
	
	ProductInitialize pi=new ProductInitialize();
	
	public static HashMap<Integer,Product> getProducts() {
		return products;
	}
	
	public static void addProduct(int productId,Product product)
	{
		products.put(productId,product);
	}
	
	public static Product getProduct(int productId)
	{
		return products.get(productId);
	}
}
