package com.ilp.utility;

import com.ilp.entity.*;
import com.ilp.services.*;
import java.util.*;

public class BankUtility {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char goToMainMenu;
		ArrayList<Service> serviceList = new ArrayList<Service>();
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		do {

			System.out.println(
					"******Welcome To Bank************\n1.Create Accounts\n2.Add Account\n3.Display Accounts\n4.Transaction Bill\n5.create service\n6.create product\n7.Manage Accounts");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				Customer newCustomer = AccountConfiguration.createCustomer(productList);
				if (newCustomer != null)
					customerList.add(newCustomer);
			}
				break;
			case 2:
				AccountConfiguration.addAccount(customerList, productList);
				break;
			case 3:
				AccountConfiguration.displayAllCustomer(customerList);
				break;
			case 4:
				AccountConfiguration.transactionBill(customerList);
				break;
			case 5:
				serviceList.add(productConfiguration.createService());
				break;
			case 6: {
				Product newProduct = productConfiguration.createProduct(serviceList);
				if (newProduct != null)
					productList.add(newProduct);
			}
				break;
			case 7:
				AccountConfiguration.manageAccounts(customerList);
				break;

			case 8:
				productConfiguration.displayAllServices(serviceList);
				productConfiguration.displayAllProduct(productList);
				AccountConfiguration.displayAllCustomer(customerList);
				AccountConfiguration.displayAllCustomer(customerList);
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			System.out.println("go to Main menu y/n");
			goToMainMenu = scanner.next().charAt(0);

		} while (goToMainMenu == 'y');
	}

}
