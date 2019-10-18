package com.storemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class salesModule {
	List<stockModule> s;
	Scanner t;

	public salesModule() {
		this.s = new ArrayList<>();
		this.t = new Scanner(System.in);

	}

	public void add()   {
		// TODO Auto-generated method stub
		int prodCode = 0;
		;
		String prodName = "";
		float prodPrice = 0;
		int prodQuant = 0;
		Boolean isValid=true;
		System.out.println("----------------Entering items in stock---------------");
		try {
		System.out.println("Enter product code! Integer 3 digit type only");
		prodCode = t.nextInt();
		validateProdCode(prodCode);
		System.out.println("Enter name of the product");
		prodName = t.next();
		validateProdName(prodName);
		System.out.println("Enter cost per item");
		prodPrice = t.nextFloat();
		System.out.println("Enter quantity being added to stock");
		prodQuant = t.nextInt();
		isValid=true;
		}catch(invalidData ex) {
			System.err.println(ex.getMessage());
			isValid=false;
		}
		
		stockModule d = new stockModule(prodCode, prodName, prodPrice, prodQuant);
		s.add(d);

	}

	public void searchProduct() {
		// TODO Auto-generated method stub

		System.out.println("Enter product whose details you want to Search");
		String name = t.next();
		int index = 0;

		for (stockModule i : s) {
			if (name.equals(i.getProdName())) {
				System.out.println(i);

			}

		}

	}

	public void update() {

		// TODO Auto-generated method stub

		System.out.println("Enter product name whose details you want to update:");
		String name = t.next();
		int index = 0;
		for (stockModule i : s) {
			if (name.equals(i.getProdName())) {
				index = s.indexOf(i);

				break;
			}
		}
		int code = 0;
		String nam = "";
		float cos = 0;
		int quan = 0;
		System.out.println("Enter product code! Integer 3 digit type only");
		code = t.nextInt();
		System.out.println("Enter name of the product");
		nam = t.next();
		System.out.println("Enter cost per item");
		cos = t.nextFloat();
		System.out.println("Enter quantity being added to stock");
		quan = t.nextInt();
		stockModule d = new stockModule(code, nam, cos, quan);
		s.set(index, d);

	}

	public void bill() {
		int code = 0;
		int quant = 0;
		float cost = 0;
		int flag = 0;

		do {

			System.out.println("Enter code of product to buy");
			code = t.nextInt();
			for (stockModule i : s) {
				if (code == i.getStockCode()) {
					System.out.println(i);
					System.out.println("Enter quantity required");
					quant = t.nextInt();
					if (quant > i.getQuant()) {
						System.out.println("This number of quantity not available. Available quantity:" + i.getQuant());

					} else {
						System.out.println("Product Code"+i.getStockCode()+"Product Name:"+i.getProdName()+"Quantity:"+quant);						
						cost = quant * i.getCost()+cost;
						i.setQuant((i.getQuant()-quant));
						
					}

				}

				else {
					System.out.println("Product Not in Directory");
				}
			}
			System.out.println("Want to buy more products. If No press 1. If yes press 0");
			flag = t.nextInt();
		} while (flag != 1);
		
		System.out.println("The product total bill is Rs:"+cost);

		// TODO Auto-generated method stub

	}
	public void validateProdCode(int ProdCode) throws invalidData {
		
		int code=ProdCode;
		if(code<99||code>999) {
			throw new invalidData("Code must be a 3 digit number");
		}
	}
	public void validateProdName(String prodName) throws invalidData {
		
		char[] h=prodName.toCharArray();
		for(char i:h) {
			if(Character.isDigit(i)) {
				throw new invalidData("Wrong name. No digits allowed");
			}
		}
	}
	
	



}
