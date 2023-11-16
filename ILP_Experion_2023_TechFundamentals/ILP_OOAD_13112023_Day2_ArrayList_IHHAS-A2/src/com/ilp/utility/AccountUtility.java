package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.service.AccountService;
import com.ilp.service.CustomerService;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = null;
		ArrayList<Account> accountList = new ArrayList<Account>();
		
		Customer customer = null;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println("1. Create Customer 2. Display Customer 3. Search a Customer 4. Add account to existing customer");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:			
				customerList.add(CustomerService.createCustomer());
				
				break;
			case 2:
				CustomerService.displayCustomer(customerList);
				break;
			case 3:
				CustomerService.searchCustomer(customerList);
				break;
			case 4:
				CustomerService.addAccountCustomer(customerList);
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);

		} while (goToMainMenu == 'y');
	}

}
