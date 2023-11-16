package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer(Account account) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name of the customer: ");
		String customerName = scanner.next();

		Customer customer = new Customer("AB100", customerName,account);

		return customer;
	}

	public static void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code" + "\t" + "Customer Name");
		System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
		System.out.println("Account No" + "\t\t" + "Account Name" + "\t" + "Account Balance");
		System.out.println(customer.getAccount().getAccountNo()+"\t\t"+customer.getAccount().getAccountName()+"\t"+customer.getAccount().getAccountBalace());

	}

}
