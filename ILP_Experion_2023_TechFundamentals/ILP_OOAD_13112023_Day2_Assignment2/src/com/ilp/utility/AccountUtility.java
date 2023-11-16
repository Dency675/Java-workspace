package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;
import com.ilp.servies.CustomerConfiguration;
import com.ilp.servies.ProductConfiguration;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Customer customer = null;
		ArrayList<Services> serviceList = new ArrayList<Services>();
		ArrayList<Product> product = null;
		ArrayList<Customer> customerList =null;
		
		char goToMainMenu;

		do {
			System.out.println("******Welcome To Bank************\r\n"
					+ "1.Create Services\r\n"
					+ "2.Create Products\r\n"
					+ "3.Create Accounts\r\n"
					+ "4.Display Accounts\r\n"
					+ "5.Transaction Bill\r\n"
					+ "6.Exit");
			System.out.print("Enter your choice : ");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				serviceList=ProductConfiguration.createSevices(serviceList);
				break;
			case 2:
				product=ProductConfiguration.createProduct(serviceList,product);
				break;
			case 3:
				customerList=CustomerConfiguration.createCustomer(product,customerList);
				break;
			case 4:
				CustomerConfiguration.displayCustomer(customerList);
				break;
			case 5:
				CustomerConfiguration.transactionBill(customerList);
				break;
			case 6:
				System.out.println("Exit");
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');

	}
}
