package com.pizzaprops.models;


public class UserInitialize {
	public UserInitialize()
	{
		addUser(new User("John Doe", "john.doe@example.com", "1234567890", "JD123", "password123", "123 Main St"));
        addUser(new User("Jane Smith", "jane.smith@example.com", "0987654321", "JS456", "password456", "456 Elm St"));
        addUser(new User("Michael Johnson", "michael.johnson@example.com", "9876543210", "MJ789", "password789", "789 Oak St"));
        addUser(new User("Emily Brown", "emily.brown@example.com", "7654321098", "EB101", "password101", "321 Pine St"));
        addUser(new User("David Wilson", "david.wilson@example.com", "6543210987", "DW202", "password202", "543 Elm St"));
        addUser(new User("Sarah Clark", "sarah.clark@example.com", "5432109876", "SC303", "password303", "765 Oak St"));
        addUser(new User("Christopher Lee", "christopher.lee@example.com", "4321098765", "CL404", "password404", "987 Maple St"));
        addUser(new User("Jessica Garcia", "jessica.garcia@example.com", "3210987654", "JG505", "password505", "876 Birch St"));
        addUser(new User("Daniel Hernandez", "daniel.hernandez@example.com", "2109876543", "DH606", "password606", "654 Walnut St"));
        addUser(new User("Elizabeth Martinez", "elizabeth.martinez@example.com", "1098765432", "EM707", "password707", "432 Pine St"));
        addUser(new User("Matthew Thompson", "matthew.thompson@example.com", "0987654321", "MT808", "password808", "210 Elm St"));
        addUser(new User("Ashley Nguyen", "ashley.nguyen@example.com", "9876543210", "AN909", "password909", "543 Oak St"));
        addUser(new User("William Rodriguez", "william.rodriguez@example.com", "8765432109", "WR1010", "password1010", "765 Cedar St"));
        addUser(new User("Amanda Moore", "amanda.moore@example.com", "7654321098", "AM1111", "password1111", "987 Maple St"));
        addUser(new User("Ryan Perez", "ryan.perez@example.com", "6543210987", "RP1212", "password1212", "321 Cherry St"));
        addUser(new User("Laura Hill", "laura.hill@example.com", "5432109876", "LH1313", "password1313", "543 Pine St"));
        addUser(new User("Jason Carter", "jason.carter@example.com", "4321098765", "JC1414", "password1414", "765 Cedar St"));
        addUser(new User("Michelle Rivera", "michelle.rivera@example.com", "3210987654", "MR1515", "password1515", "987 Elm St"));
        addUser(new User("Kevin Ward", "kevin.ward@example.com", "2109876543", "KW1616", "password1616", "210 Oak St"));
        addUser(new User("Stephanie Foster", "stephanie.foster@example.com", "1098765432", "SF1717", "password1717", "543 Maple St"));
	}

	public static void addUser(User user) 
	{
		UserManagement.users.add(user);
	}
}




















//
//users.add(new User("John Doe", "john.doe@example.com", "1234567890", "JD123", "password123", "123 Main St"));
//users.add(new User("Jane Smith", "jane.smith@example.com", "0987654321", "JS456", "password456", "456 Elm St"));
//users.add(new User("Michael Johnson", "michael.johnson@example.com", "9876543210", "MJ789", "password789", "789 Oak St"));
//users.add(new User("Emily Brown", "emily.brown@example.com", "7654321098", "EB101", "password101", "321 Pine St"));
//users.add(new User("David Wilson", "david.wilson@example.com", "6543210987", "DW202", "password202", "543 Elm St"));
//users.add(new User("Sarah Clark", "sarah.clark@example.com", "5432109876", "SC303", "password303", "765 Oak St"));
//users.add(new User("Christopher Lee", "christopher.lee@example.com", "4321098765", "CL404", "password404", "987 Maple St"));
//users.add(new User("Jessica Garcia", "jessica.garcia@example.com", "3210987654", "JG505", "password505", "876 Birch St"));
//users.add(new User("Daniel Hernandez", "daniel.hernandez@example.com", "2109876543", "DH606", "password606", "654 Walnut St"));
//users.add(new User("Elizabeth Martinez", "elizabeth.martinez@example.com", "1098765432", "EM707", "password707", "432 Pine St"));
//users.add(new User("Matthew Thompson", "matthew.thompson@example.com", "0987654321", "MT808", "password808", "210 Elm St"));
//users.add(new User("Ashley Nguyen", "ashley.nguyen@example.com", "9876543210", "AN909", "password909", "543 Oak St"));
//users.add(new User("William Rodriguez", "william.rodriguez@example.com", "8765432109", "WR1010", "password1010", "765 Cedar St"));
//users.add(new User("Amanda Moore", "amanda.moore@example.com", "7654321098", "AM1111", "password1111", "987 Maple St"));
//users.add(new User("Ryan Perez", "ryan.perez@example.com", "6543210987", "RP1212", "password1212", "321 Cherry St"));
//users.add(new User("Laura Hill", "laura.hill@example.com", "5432109876", "LH1313", "password1313", "543 Pine St"));
//users.add(new User("Jason Carter", "jason.carter@example.com", "4321098765", "JC1414", "password1414", "765 Cedar St"));
//users.add(new User("Michelle Rivera", "michelle.rivera@example.com", "3210987654", "MR1515", "password1515", "987 Elm St"));
//users.add(new User("Kevin Ward", "kevin.ward@example.com", "2109876543", "KW1616", "password1616", "210 Oak St"));
//users.add(new User("Stephanie Foster", "stephanie.foster@example.com", "1098765432", "SF1717", "password1717", "543 Maple St"));