package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.service.AccountService;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = null;


		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println("1. Create Account 2. Display Account ");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				account = AccountService.createAccount();
				break;
			case 2:
				AccountService.displayAccount(account);
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);

		} while (goToMainMenu == 'y');
	}

}
