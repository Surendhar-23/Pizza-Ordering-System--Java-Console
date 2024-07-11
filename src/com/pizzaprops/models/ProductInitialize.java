package com.pizzaprops.models;

public class ProductInitialize {
	

	public ProductInitialize(){	
	addProduct(1,new Product(1, "Margherita Pizza", 9.99, "Classic pizza with tomato sauce, mozzarella, and basil"));
     addProduct(2,new Product(2, "Pepperoni Pizza", 11.99, "Pizza topped with pepperoni slices and mozzarella cheese"));
     addProduct(3,new Product(3, "Vegetarian Pizza", 10.99, "Pizza loaded with assorted vegetables and cheese"));
     addProduct(4,new Product(4, "BBQ Chicken Pizza", 12.99, "Pizza topped with BBQ sauce, chicken, onions, and cheese"));
     addProduct(5,new Product(5, "Hawaiian Pizza", 11.99, "Pizza topped with ham, pineapple, and mozzarella cheese"));
     addProduct(6,new Product(6, "Meat Lover's Pizza", 13.99, "Pizza loaded with various meats like pepperoni, sausage, and bacon"));
     addProduct(7,new Product(7, "Mushroom Pizza", 10.99, "Pizza topped with mushrooms, cheese, and tomato sauce"));
     addProduct(8,new Product(8, "Supreme Pizza", 12.99, "Pizza topped with pepperoni, sausage, bell peppers, onions, and olives"));
     addProduct(9,new Product(9, "Buffalo Chicken Pizza", 12.99, "Pizza with buffalo chicken, ranch dressing, and mozzarella cheese"));
     addProduct(10,new Product(10, "Four Cheese Pizza", 11.99, "Pizza topped with a blend of four cheeses: mozzarella, cheddar, provolone, and parmesan"));
     addProduct(11,new Product(11, "Spinach and Feta Pizza", 10.99, "Pizza topped with spinach, feta cheese, garlic, and olive oil"));
     addProduct(12,new Product(12, "Pesto Chicken Pizza", 12.99, "Pizza with pesto sauce, chicken, sun-dried tomatoes, and mozzarella cheese"));
     addProduct(13,new Product(13, "White Pizza", 11.99, "Pizza without tomato sauce, topped with ricotta cheese, garlic, and spinach"));
     addProduct(14,new Product(14, "Barbecue Bacon Cheeseburger Pizza", 13.99, "Pizza with BBQ sauce, ground beef, bacon, onions, and cheddar cheese"));
     addProduct(15,new Product(15, "Artichoke and Olive Pizza", 11.99, "Pizza topped with artichoke hearts, black olives, red onion, and feta cheese"));
     addProduct(16,new Product(16, "Pineapple Jalapeno Pizza", 11.99, "Pizza with pineapple chunks, jalapeno peppers, and mozzarella cheese"));
     addProduct(17,new Product(17, "Sausage and Mushroom Pizza", 10.99, "Pizza topped with Italian sausage, mushrooms, and mozzarella cheese"));
     addProduct(18,new Product(18, "Chicken Alfredo Pizza", 12.99, "Pizza with alfredo sauce, grilled chicken, spinach, and mozzarella cheese"));
     addProduct(19,new Product(19, "Greek Pizza", 11.99, "Pizza with spinach, feta cheese, tomatoes, olives, and red onions"));
     addProduct(20,new Product(20, "Capricciosa Pizza", 12.99, "Pizza with ham, mushrooms, artichokes, and olives"));
	}
	
	public static void addProduct(int productId,Product product)
	{
		ProductManagement.products.put(productId,product);
	}
	
}
