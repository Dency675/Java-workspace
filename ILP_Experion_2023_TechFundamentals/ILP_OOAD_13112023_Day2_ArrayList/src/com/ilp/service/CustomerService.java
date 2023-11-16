package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();
		System.out.print("Enter name of the customer: ");
		String customerName = scanner.next();

		return new Customer(customerCode, customerName);
	}

	public static void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code" + "\t" + "Customer Name");
		System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());

	}

	public static void displayAllCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code" + "\t" + "Customer Name");
		for (Customer customerr : customerList)
			System.out.println(customerr.getCustomerCode() + "\t\t" + customerr.getCustomerName());
	}

	public static void searchAccount(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();

		for (Customer customer : customerList)
			if (customer.getCustomerCode().equals(customerCode)) {
				System.out.println("Customer Code" + "\t" + "Customer Name");
				System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
			}
	}
}