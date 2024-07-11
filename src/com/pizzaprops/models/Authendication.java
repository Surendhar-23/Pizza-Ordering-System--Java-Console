package com.pizzaprops.models;

import java.util.Scanner;

public class Authendication {

	UserManagement um = new UserManagement();

	User getAuthendication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n--------------------User -----------------------\n");
		System.out.println("\n 1.Existing user \n 2.Create new account \n 3.Exit");
		int choice = sc.nextInt();
		while (true) {
			switch (choice) {
			case 1:
				User u = getLogin();
				if (u != null)
					return u;
				break;
			case 2:
				getSignup();
				User u1 = getLogin();
				if (u1 != null)
					return u1;
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("\nInvalid choice Made");
			}
		}
	}

	User getLogin() {
		System.out.println("\n-------------------- Login -----------------------\n");

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the email Id :\n");
			String emailId = sc.nextLine();
			System.out.println("\nEnter the Password :\n");
			String password = sc.nextLine();

			User user = um.getUser(emailId);
			try {
				if (user != null) {
					if (user.getPassword().equals(password))
						return user;
					else
						System.out.println("\nUser name or password invalid..\n");
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	void getSignup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine();

		System.out.println("Enter email:");
		String email = sc.nextLine();

		System.out.println("Enter mobile number:");
		String mobileNo = sc.nextLine();

		System.out.println("Enter user ID:");
		String userId = sc.nextLine();

		System.out.println("Enter password:");
		String password = sc.nextLine();

		System.out.println("Enter Confirm password:");
		String confpassword = sc.nextLine();

		while (!password.equals(confpassword)) {
			System.out.println("Passwords do not match. Re-enter password:");
			password = sc.nextLine();

			System.out.println("Enter Confirm password:");
			confpassword = sc.nextLine();

		}

		System.out.println("Enter address (Optional) : ");
		String address = sc.nextLine();

		if (!name.isEmpty() && !email.isEmpty() && !mobileNo.isEmpty() && !userId.isEmpty() && !password.isEmpty()) {
			User user = new User(name, email, mobileNo, userId, password, address);
			addUser(user);
			System.out.println("User created successfully!");
		} else {
			System.out.println("Please fill in all the required fields.");
		}
	}

	public static void addUser(User user) 
	{
		UserManagement.users.add(user);
	}
}
