package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		ArrayList<Account> accountList = new ArrayList<Account>();

		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();
		System.out.print("Enter name of the customer: ");
		String customerName = scanner.next();
		char goToMainMenu;
		do {
			accountList.add(AccountService.createAccount());
			System.out.print("Do you want to create another account (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);

		} while (goToMainMenu == 'y');

		return new Customer(customerCode, customerName, accountList);
	}

	public static void displayCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		System.out.println();
		for (Customer customerr : customerList) {
			System.out.println("Customer Code" + "\t" + "Customer Name");
			System.out.println(customerr.getCustomerCode() + "\t\t" + customerr.getCustomerName());
			System.out.println("Account No" + "\t" + "Account Name" + "\t" + "Account Balance");
			for (Account account : customerr.getAccountList())
				System.out.println(
						account.getAccountNo() + "\t" + account.getAccountName() + "\t" + account.getAccountBalace());
		}
		System.out.println();

	}

	public static void searchCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();

		for (Customer customer : customerList)
			if (customer.getCustomerCode().equals(customerCode)) {
				System.out.println("Customer Code" + "\t" + "Customer Name");
				System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
				for (Account account : customer.getAccountList())
					System.out.println(account.getAccountNo() + "\t" + account.getAccountName() + "\t"
							+ account.getAccountBalace());
			}
	}

	public static void addAccountCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();

		
		for (Customer customer : customerList)
			if (customer.getCustomerCode().equals(customerCode)) {
				customer.getAccountList().add(AccountService.createAccount());
			}
		
		
	}

}