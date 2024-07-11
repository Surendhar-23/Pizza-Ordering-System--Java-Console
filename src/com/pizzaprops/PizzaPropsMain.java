package com.pizzaprops;
import java.util.Scanner;

import com.pizzaprops.models.*;
//import com.pizzaprops.models.UserProcess;
public class PizzaPropsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("\n------------------------------------Welcome---------------------------------\n");
		while(true)
		{
			System.out.println("\n1.User\n2.Admin\n");
			System.out.println("\n----------------------------------------------------------------------------\n");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			UserProcess up=new UserProcess();
			break;
			case 2:
			AdminProcess Ap=new AdminProcess();
			break;
			}
		}
	}

}
