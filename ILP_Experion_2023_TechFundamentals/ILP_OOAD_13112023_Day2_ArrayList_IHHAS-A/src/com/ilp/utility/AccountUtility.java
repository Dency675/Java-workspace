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
			System.out.println("1. Create Account 2. Display All Account 3.Search an Account 4. Create Customer 5. Display Customer 6. Search a Customer");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
//				account = AccountService.createAccount();
//				accountList.add(account);
				
				accountList.add(AccountService.createAccount());
				break;
			case 2:
				AccountService.displayAllAccount(accountList);
				break;
			case 3:
				AccountService.searchAccount(accountList);
				break;
			case 4:
				customerList.add(CustomerService.createCustomer(accountList));
				
				break;
			case 5:
				CustomerService.displayCustomer(customerList);
				break;
			case 6:
				CustomerService.searchCustomer(customerList);
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);

		} while (goToMainMenu == 'y');
	}

}
