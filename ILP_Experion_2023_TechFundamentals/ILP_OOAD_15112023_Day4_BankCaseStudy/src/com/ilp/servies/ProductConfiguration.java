package com.ilp.servies;

import java.util.ArrayList;
import java.util.Scanner;
import com.ilp.entity.CurrentAccount;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsMaxAccount;
import com.ilp.entity.Services;
import java.util.regex.Pattern;

public class ProductConfiguration {
	public static ArrayList<Services> createSevices(ArrayList<Services> serviceList) {

		Scanner scanner = new Scanner(System.in);

		Services services = null;
		char goBack;
		do {

			System.out.print("Enter the Service code : ");
			String serviceCode = scanner.next();

			System.out.print("Enter the Service Name : ");
			String serviceName = scanner.next();
			
			System.out.print("Enter the Service rate : ");
			double rate = scanner.nextDouble();

			services = new Services(serviceCode, serviceName, rate);

			System.out.println("Do you want to add more services : (y/n)");
			goBack = scanner.next().charAt(0);
			serviceList.add(services);
		} while (goBack == 'y');

		return serviceList;
	}

	public static ArrayList<Product> createProduct(ArrayList<Services> serviceList, ArrayList<Product> ProductList) {
		
		Services services = null;

		Scanner scanner = new Scanner(System.in);

		char goBack;
		do {

			ArrayList<Services> serviceProductList = new ArrayList<Services>();
			System.out.print("Enter the Product code : ");
			String productCode = scanner.next();
			System.out.print("Enter the Product Name : ");
			String productName = scanner.next();

			services = new Services("001", "Deposit money", 0.05);
			serviceProductList.add(services);

			char goToMenu;
			do {
				System.out.println("\nList of available service:\n");
				for (Services service : serviceList) {
					System.out.println(
							service.getServiceCode() + "\t" + service.getServiceName() + "\t" + service.getRate());
				}

				System.out.println("Choose the service:");
				int choice = scanner.nextInt();

				serviceProductList.add(serviceList.get(choice - 1));

				System.out.println();

				System.out.println("Added Services ");
				for (Services service : serviceProductList) {
					System.out.println(
							service.getServiceCode() + "\t" + service.getServiceName() + "\t" + service.getRate());
				}

				System.out.print("Do you want to continue(y/n):");
				goToMenu = scanner.next().charAt(0);
			} while (goToMenu == 'y');

			System.out.println("productName: " + productName);

			Pattern savingsAccount = Pattern.compile(
					"Savings account|SavingsMaxAccount|SavingsAccount|Savings Max Account", Pattern.CASE_INSENSITIVE);
			Pattern currentAccount = Pattern.compile("Current account|CurrentAccount", Pattern.CASE_INSENSITIVE);
			Pattern loanAccount = Pattern.compile("Loan account|LoanAccount", Pattern.CASE_INSENSITIVE);

			if (savingsAccount.matcher(productName).find()) {
				System.out.println("Savings Max Account ");
				ProductList.add(new SavingsMaxAccount(productCode, "Savings Max Account", serviceProductList));
			} else if (currentAccount.matcher(productName).find()) {
				System.out.println("current Account ");
				ProductList.add(new CurrentAccount(productCode, "Current Account", serviceProductList));
			} else if (loanAccount.matcher(productName).find()) {
				System.out.println("loan Account ");
				ProductList.add(new LoanAccount(productCode, "Loan Account", serviceProductList));
			} else {
				System.out.println("Product should be Savings Max Account or Current Account or Loan Account ");
			}

			System.out.println("Do you want to add more products : (y/n)");
			goBack = scanner.next().charAt(0);

		} while (goBack == 'y');

		return ProductList;
	}

}
