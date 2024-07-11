package com.pizzaprops.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User implements Serializable{
	private String name;
	private String mobileNo;
	private String emailId;
	private String password;
	private String address="No address";
	private String userId;
	private List<Order> orderHistory=new ArrayList<>();
	private HashMap<Product,Integer> cart=new HashMap<>();


	public User(String name, String emailId, String mobileNo, String userId,String password,String address) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.userId = userId;
	}

	public User(String name, String emailId, String mobileNo, String userId,String password) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
		this.userId = userId;
	}

	public HashMap<Product,Integer> getCart() {
		return cart;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Order> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(List<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public void addToOrderHistory(Order order) {
		this.orderHistory.add(order);
	}

	public void addToUserCart(Product product,int q) {
		if (cart.containsKey(product)) {
			int quantity = cart.get(product);
			cart.put(product, quantity + q);
		}
		else cart.put(product, q);
	}

	public void updateUserCart(Product product,int q)
	{
		cart.put(product, q);
	}

	public void RemoveFromUserCart(Product product)
	{
		if(cart.containsKey(product))
			cart.remove(product);
	}

	public void addOrder(Order order)
	{
		orderHistory.add(order);
	}


}
