package com.pizzaprops.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManagement {  

	public static List<User> users = retrieveUsers();
//	UserInitialize ui=new UserInitialize();

	static public User getUser(String email)
	{
		for(User u:users)
		{
			if(u.getEmailId().equals(email))
				return u;
		}
		return null;
	}


	public static void storeUsers() {
		try {
			File file = new File("users.dat");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(users);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<User> retrieveUsers() {
		List<User> retrievedUsers = null;
		try (FileInputStream fis = new FileInputStream("users.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			retrievedUsers = (List<User>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return retrievedUsers != null ? retrievedUsers : new ArrayList<>(); 
	}
}

