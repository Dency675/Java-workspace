package com.ilp.servies;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.entity.Services;

public class ProductService {

	public static Product createProduct() {
		// TODO Auto-generated method stub

		Product product = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n****Accounts Available*********** \r\n" + "1. Savings Max Account \r\n"
				+ "2. Current Account \r\n" + "3. Loan Account \r\n" + "Enter Your choice : ");
		int choice = scanner.nextInt();
		char goToMenu;
		ArrayList<Services> serviceList = new ArrayList<Services>();
		do {
			serviceList.add(ServiceService.createService());
			System.out.print("Do you want to continue(y/n):");
			goToMenu = scanner.next().charAt(0);
		} while (goToMenu == 'y');

		switch (choice) {
		case 1:
			product = new Product("PR100", "Savings Max Account", serviceList);
			break;
		case 2:
			product = new Product("PR200", "Current Account", serviceList);
			break;
		case 3:
			product = new Product("PR300", "Loan Account", serviceList);
			break;
		}
		return product;

	}

}
