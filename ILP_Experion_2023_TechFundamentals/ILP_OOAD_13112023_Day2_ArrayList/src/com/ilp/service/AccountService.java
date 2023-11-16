package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account Code: ");
		String accountCode = scanner.nextLine();
		System.out.print("Enter account Name: ");
		String accountName = scanner.nextLine();
		System.out.print("Enter opening balance: ");
		double openingBalance = scanner.nextDouble();

		return new Account(accountCode, accountName, openingBalance);
	}

	public static void displayAllAccount(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub
		System.out.println("Account No" + "\t" + "Account Name" + "\t" + "Account Balance");

		for (Account account : accountList)
			System.out.println(
					account.getAccountNo() + "\t\t" + account.getAccountName() + "\t" + account.getAccountBalace());
	}

	public static void searchAccount(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account Code: ");
		String accountCode = scanner.nextLine();

//		for (Account account : accountList)
//			if((account.getAccountNo().compareToIgnoreCase(accountCode)) == 0) {
//				System.out.println("Account No" + "       " + "Account Name" + "     " + "Account Balance");
//				System.out.println(account.getAccountNo() + "\t\t" + account.getAccountName() + "     "
//						+ account.getAccountBalace());
//			}

		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountCode)) {
				System.out.println("Account No" + "\t" + "Account Name" + "\t" + "Account Balance");
				System.out.println(account.getAccountNo() + "\t\t" + account.getAccountName() + "\t"
						+ account.getAccountBalace());
			}

		}

//		compareTo & compareToIgnoreCase returns integer value
//			equals & equalsIgnoreCase returns boolean value
//		compareTo &  equals are case sensitive, whether compareToIgnoreCase & equalsIgnoreCase are not

	}

}
