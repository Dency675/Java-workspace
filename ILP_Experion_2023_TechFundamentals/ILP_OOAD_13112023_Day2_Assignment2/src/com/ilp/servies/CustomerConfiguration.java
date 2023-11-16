package com.ilp.servies;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;

public class CustomerConfiguration {

	public static Account createAccount(ArrayList<Product> product) {

		Scanner scanner = new Scanner(System.in);

		Account account = null;

		System.out.print("Enter the Account Code: ");
		String accountNo = scanner.nextLine();

		System.out.print("Enter the Account Balance: ");
		int accountBalance = scanner.nextInt();

		System.out.println("***********Available Products****************");
		System.out.println("Product Code" + "\t\t" + " Product Name");

		for (Product productItem : product) {
			System.out.println(productItem.getProductCode() + "\t" + productItem.getProductName());
		}

		System.out.println("Choose one product");
		int chooseProduct = scanner.nextInt();

		account = new Account(accountNo, accountBalance, product.get(chooseProduct - 1));

		return account;
	}

	public static ArrayList<Customer> createCustomer(ArrayList<Product> product, ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

//		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Account> accountList = new ArrayList<Account>();

		System.out.print("Enter the customer code");
		String customerCode = scanner.nextLine();

		System.out.print("Enter the customer name");
		String customerName = scanner.nextLine();

		char goBack;
		do {
			accountList.add(createAccount(product));

			System.out.println("Do you want to add more accounts: (y/n)");
			goBack = scanner.next().charAt(0);
		} while (goBack == 'y');

		customerList.add(new Customer(customerCode, customerName, accountList));
		return customerList;

	}

	public static void displayCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

		System.out.println("Account Details \n");
		for (Customer customer : customerList) {
			System.out.println(
					"Customer Code" + "\t" + "Customer Name" + "\t" + "Account NO" + "\t" + "Account Balance");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------");
			for (Account account : customer.getAccountList()) {

				System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName() + "\t\t"
						+ account.getAccountNo() + "\t\t\t" + account.getBalance());
			}

		}

	}

	public static void transactionBill(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter customer code: ");
		String customerCode = scanner.nextLine();

		for (Customer customer : customerList) {
			if (customer.getCustomerCode().equals(customerCode)) {

				System.out.println(customer.getCustomerName() + "  has the following accounts ");

				int index = 0;

				for (Account account : customer.getAccountList()) {
					System.out.println((++index) + " " + account.getProduct().getProductName());
				}

				System.out.print("\nEnter your choice : ");
				int chooseAccount = scanner.nextInt();

				System.out.println("\nChoose the Service you want to use \n");

				System.out.println("Services available for "
						+ customer.getAccountList().get(chooseAccount - 1).getProduct().getProductName() + ":");

				for (Services serv : customer.getAccountList().get(chooseAccount - 1).getProduct().getServiceList()) {
//					System.out.println(chooseAccount);
					System.out.println(serv.getServiceCode() + "\t" + serv.getServiceName() + "\t" + serv.getRate());
				}

				System.out.println();

				System.out.print("\nEnter your choice : ");
				int chooseSevice = scanner.nextInt();

				System.out.print("\nEnter the no. of  transaction: ");
				int noOfTransaction = scanner.nextInt();

				double rateOfTransaction = (customer.getAccountList().get(chooseAccount - 1).getProduct().getServiceList()
						.get(chooseSevice-1).getRate());
				double total = noOfTransaction * (rateOfTransaction);

				System.out.println("Total transaction rate for this services : " + total);
			}
		}

	}

}
