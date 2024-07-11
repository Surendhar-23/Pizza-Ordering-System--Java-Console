package com.pizzaprops.models;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;    

public class OrderManagement {

	public static List<Order> orders = new ArrayList<>();


	static public void makeOrder(User user,Product product,int quantity) {
		String paymentStatus="Paid";
		Order order=new Order(getNextOrderId(),user.getUserId(),getDate(),product.getName(),quantity,getPrice(product.getPrice(),quantity),paymentStatus);
		orders.add(order);
		user.addOrder(order);
	}
	
	static public String getDate()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");   
		LocalDateTime now= LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		return formatter.format(now);  
	}

	static public double getPrice(double price ,int quantity)
	{
		return ((double)price*quantity);
	}

	public static String getNextOrderId() {
		int maxOrderId = 0;
		for (Order o : orders) {
			int currentOrderId = Integer.parseInt(o.getOrderId());
			if (currentOrderId > maxOrderId)
				maxOrderId = currentOrderId;
		}
		return String.valueOf(maxOrderId + 1);
	}
	
}
