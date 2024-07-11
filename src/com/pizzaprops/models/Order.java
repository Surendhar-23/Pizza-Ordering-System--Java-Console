package com.pizzaprops.models;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{

	private String orderId;
	private String userId;
	private String orderDate;
	private String pizzaType;
	private int quantity;
	private double totalPrice;
	private String paymentStatus;
	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	private String status;
	


	public Order(String orderId, String userId, String orderDate, String pizzaType, int quantity, double totalPrice,String paymentStatus) {
		this.orderId = orderId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.pizzaType = pizzaType;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.paymentStatus=paymentStatus;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
