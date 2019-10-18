package com.storemanager;

import java.util.*;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int option = 0;

		salesModule k = new salesModule();

		do {
			System.out.println("--------------------Stock Management--------------------");
			System.out.println("MENU");
			System.out.println("1.New Entry in Stock");
			System.out.println("2.Print all available product");
			System.out.println("3.Search for product in Stock");
			System.out.println("4.Update Details in stock");
			System.out.println("--------------------Billing Counter--------------------");
			System.out.println("MENU");
			System.out.println("5. Buy Products and Generate Bill");
			System.out.println("6. Exit");
			
			System.out.print("\nOption > ");
			option = s.nextInt();
			switch (option) {
			case 1:

				k.add();

				break;
			case 2:
				System.out.println("All Available products with required details are");
				for (stockModule i:k.s) {
					System.out.println(i);
				}

				break;
			case 3:
				k.searchProduct();

				break;
			case 4:
				k.update();	
				break;
			case 5:
				k.bill();
				break;
			case 6:
				option=6;
				break;
		
			default:
				option = 6;
				break;
			}

		} while (option != 6);

	}

}
