package com.pizzaprops.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserProcess {

	static ProductManagement manageProducts=new ProductManagement();
	static Authendication auth=new Authendication();
	static OrderManagement manageOrder=new OrderManagement();
	static UserManagement manageUser=new UserManagement();

	static User user=null;
	public UserProcess()
	{
		user=new User("John Doe", "john.doe@example.com", "1234567890", "JD123", "password123", "123 Main St");
		//		home();
		System.out.println("\n----------------------------Welcome----------------------\n");


		while(true)
		{
			user=auth.getAuthendication();
			if(user!=null)
			{
				home();
			}
		}

	}

	static public void home()
	{
		if(user!=null) {
			Scanner sc=new Scanner(System.in);
			System.out.println("\n----------------------------Login Success----------------------\n");
			System.out.println("\n***************** Welcome "+user.getName()+"*************\n");

			while(true)
			{
				save();
				System.out.println("\n 1.View Menu\n 2.View Cart\n 3.View Orders\n 4.View Profile\n 5.Log out\n 6.Exit \n");
				System.out.println("\n---------------------------Select your Option-----------------------------------\n");
				int choice=sc.nextInt();
				if(choice==5)
					break;
				switch(choice)
				{
				case 1:
					showMenu();
					break;
				case 2:
					viewCart();
					break;
				case 3:
					viewOrders();
					break;
				case 4:
					viewProfile();
					break;
				case 5:
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("Invalid choice..!");
				}
			}
		}
	}


	//	
	// show Menu
	//	
	static public void showMenu() {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("-----------------Menu-------------------");
			HashMap<Integer, Product> products = manageProducts.getProducts();

			for (Map.Entry<Integer, Product> productEntry : products.entrySet()) {
				System.out.println(productEntry.getValue().toString());
			}

			System.out.println("\n----------------------------------------------------------------------------\n");
			System.out.println("\n1.Select Product\n2.Back\n3.Exit\n");
			int choice=sc.nextInt();
			if(choice==2)
				break;
			switch(choice)
			{
			case 1:
				System.out.println("\n---------------------------Select Product-----------------------------------\n");
				int PId=sc.nextInt();
				viewProduct(PId);
				break;
			case 2:
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice..!");
			}	
		}
	}

	//
	//	Cart
	//	

	static public void viewCart()
	{
		Scanner sc = new Scanner(System.in);
		double totalCartPrice = 0;
		System.out.println("\n---------------------------Cart Products-----------------------------------\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("| %-5s | %-20s | %-8s | %-6s |\n", "ID", "Product Name", "Quantity", "Price");
		System.out.println("---------------------------------------------------------------------------------");
		for (HashMap.Entry<Product, Integer> p : user.getCart().entrySet()) {
			Product product = p.getKey();
			int quantity = p.getValue();
			double totalPrice = quantity * product.getPrice();
			totalCartPrice += totalPrice;
			System.out.printf("| %-5d | %-20s | %-8d | %-6.2f |\n", product.getProductId(), product.getName(), quantity, totalPrice);
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("Total Cart Price: $%.2f\n", totalCartPrice);
		System.out.println("\n---------------------------------------------------------------------------------\n");

		while(true)
		{
			System.out.println("\n1.CheckOut \n2.Update Quantity \n3.Remove Products \n4.Back\n");
			int choice=sc.nextInt();
			if(choice==4)
				break;
			switch(choice)
			{
			case 1:
				//checkout();
				break;
			case 2:
				updateQuantity();
				viewCart();
				break;
			case 3:
				removeProducts();
				viewCart();
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice..!");
			}	
		}
	}

	//	UpdateCart

	static public void updateQuantity()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n----------------------------------------------Update Quantity----------------------------------------\n");
		System.out.println("Enter product Id :");
		int PId=sc.nextInt();
		Product product=manageProducts.getProduct(PId);
		if(!isCartContainsProduct(product)) {
			System.out.println("Invalid Product Id");
			return;
		}
		System.out.println("Enter quantity :");
		int quantity=sc.nextInt();
		user.updateUserCart(product, quantity);
	}

	static public void removeProducts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n-------------------------------------------Remove Product------------------------------------------\n");
		System.out.println("Enter product Id :");
		int PId=sc.nextInt();
		Product product=manageProducts.getProduct(PId);
		if(!isCartContainsProduct(product)) {
			System.out.println("Invalid Product Id");
			return;
		}
		user.RemoveFromUserCart(product);
	}

	// Check if product contains in cart

	static public boolean isCartContainsProduct(Product product)
	{
		Set<Product> cartProducts=user.getCart().keySet();
		return cartProducts.contains(product);
	}



	//	
	// Orders
	//	

	static public void viewOrders() {
		System.out.println("\n---------------------------Order History-----------------------------------\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("| %-8s | %-20s | %-8s | %-8s | %-10s | %-10s | %-12s |\n", "Order ID", "Product Name", "Quantity", "Price", "Status", "Payment Status", "Order Date");
		System.out.println("---------------------------------------------------------------------------------");
		for (Order order : user.getOrderHistory()) {
			System.out.printf("| %-8s | %-20s | %-8d | %-8.2f | %-10s | %-14s | %-12s |\n", order.getOrderId(), order.getPizzaType(), order.getQuantity(), order.getTotalPrice(), order.getStatus(), order.getPaymentStatus(), order.getOrderDate());
		}
	}


	//	
	//Products
	//

	static public void viewProduct(int PId)
	{
		Scanner sc=new Scanner(System.in);
		Product product=ProductManagement.getProduct(PId);
		System.out.println(product.toString());
		System.out.println("------------Product Id : "+product.getProductId()+"-------------");

		System.out.println("\n---------------------------Choose-----------------------------------\n");
		System.out.println("\n1.Order Now\n2.Add to Cart\n3.Back\n4.Exit\n");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			orderNow(product);
			break;
		case 2:
			AddToCart(product);
			break;
		case 3:
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Invalid choice..!");
		}
	}

	//	
	//	View Profile
	//	

	static public void viewProfile()
	{  
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\nUser Profile:\n");
			System.out.println("-------------------------------------------");
			System.out.printf("Username: %-15s\n", user.getName());
			System.out.printf("User ID: %-15s\n", user.getUserId());
			System.out.printf("Email: %-18s\n", user.getEmailId());
			System.out.printf("Mobile No: %-15s\n", user.getMobileNo());
			System.out.printf("Address: %-30s\n", user.getAddress());
			System.out.println("--------------------------------------------");

			System.out.println("\n1.Update Profile\n2.Change Password\n3.Back\n");
			int choice=sc.nextInt();
			if(choice==3)
				break;
			switch(choice)
			{
			case 1:
				updateProfile();
				break;
			case 2:
				changePassword();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice..!");
			}
		}
		save();
	}

	//	Update
	
	static public void updateProfile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n-------------------------------------Update Profile--------------------------------------------\n");
		System.out.println("\n1.Update Username\n2.Update UserId\n3.Update EmailId\n4.Update MobileNo\n5.Update Address\n6.Back");
		System.out.println("\n-----------------------------------------------------------------------------------------------\n");
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter new UserName : ");
			String userName=sc.nextLine();
			user.setName(userName);
			break;
		case 2:
			System.out.println("Enter new UserId : ");
			String userId=sc.nextLine();
			user.setUserId(userId);
			break;
		case 3:
			System.out.println("Enter new EmailId : ");
			String EmailID=sc.nextLine();
			user.setEmailId(EmailID);
			break;
		case 4:
			System.out.println("Enter new MobileNo : ");
			String MobileNo=sc.nextLine();
			user.setMobileNo(MobileNo);
			break;
		case 5:
			System.out.println("Enter new Address : ");
			String address=sc.nextLine();
			user.setAddress(address);
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("Invalid choice..!");
		}
	}

	//	Update password

	static public void changePassword()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter current Password : ");
		String curPass=sc.nextLine();
		System.out.println("Enter new Password : ");
		String newPass=sc.nextLine();

		if(user.getPassword().equals(curPass)) {
			user.setPassword(newPass);
			System.out.println("Password updated Successfully..!");
		}
		else
			System.out.println("Please check your current password");
	}

	static public void AddToCart(Product product)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity to add to cart:");
		int quantity=sc.nextInt();
		user.addToUserCart(product,quantity);
		save();
	}

	static void orderNow(Product product)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity to order:");
		int quantity=sc.nextInt();
		manageOrder.makeOrder(user, product, quantity);
		save();
	}


	static void save()
	{
		manageUser.storeUsers();
	}

}
