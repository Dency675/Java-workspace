package com.ilp.entity;

import java.util.ArrayList;

public class SavingsMaxAccount extends Product {

	public SavingsMaxAccount(String productCode, String productName, ArrayList<Services> serviceList) {
		super(productCode, productName, serviceList);
		// TODO Auto-generated constructor stub
		
	}
	public static boolean minimumBalance(int amount) {
		if(amount <1000) {
			System.out.println("Minimum balance Rs. 1000 is required for Savings Max Account.");
			return false;
		}
		else 
			return true;
	}

}
