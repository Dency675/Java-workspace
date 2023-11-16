package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name of the customer: ");
		String customerName = scanner.next();

		Customer customer = new Customer("AB100", customerName);

		return customer;
	}

	public static void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code" + "\t" + "Customer Name");
		System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());

	}

}
