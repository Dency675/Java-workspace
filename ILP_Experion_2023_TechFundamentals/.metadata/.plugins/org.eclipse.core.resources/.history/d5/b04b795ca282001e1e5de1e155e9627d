package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Account;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter opening balance: ");
		double openingBalance = scanner.nextDouble();

		Account account = new Account("ACC100", "Savings account", openingBalance);

		return account;
	}

	public static void displayAccount(Account account) {
		// TODO Auto-generated method stub

		System.out.println("Account No" + "       " + "Account Name" + "     " + "Account Balance");
		System.out.println(
				account.getAccountNo() + "\t\t" + account.getAccountName() + "     " + account.getAccountBalace());
	}

}
