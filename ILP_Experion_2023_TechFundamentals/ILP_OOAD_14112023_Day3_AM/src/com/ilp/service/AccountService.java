package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.CurrentAccount;
import com.ilp.entity.SavingsAccount;

public abstract class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);

		Account account = null;

		System.out.print("Enter account Code: ");
		String accountCode = scanner.nextLine();
		System.out.print("Enter account Name: ");
		String accountName = scanner.nextLine();
		System.out.print("Enter opening balance: ");
		double openingBalance = scanner.nextDouble();
		
		System.out.print(
				"Which type of account do you want: \n 1. Savings Account \n 2. Current Account\n Enter your choice: ");
		int accountChoice = scanner.nextInt();

		switch (accountChoice) {
		case 1:
			account = createSavingsAccount(accountCode, openingBalance);
			break;
		case 2:
			account = createCurrentAccount(accountCode, openingBalance);
			break;

		}

		return account;
	}


	private static SavingsAccount createSavingsAccount(String accountNo, double openingBalance) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the roi: ");
		String roi = scanner.nextLine();

		SavingsAccount account = new SavingsAccount(accountNo, "Savings Account", openingBalance, roi);

		return account;
	}

	private static CurrentAccount createCurrentAccount(String accountNo, double openingBalance) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the gstNo: ");
		String gstNo = scanner.nextLine();

		CurrentAccount account = new CurrentAccount(accountNo, "Current Account", openingBalance, gstNo);

		return account;
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


	public static void depositMoney() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Deposit Service\n 2. Withdrawal Service \n Enter your choice: ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			DepositService depositService = new DepositService();
			depositService.freeTransaction();
		}
		else if(choice == 2) {
			WithdrawalService withdrawalService = new WithdrawalService();
			withdrawalService.freeTransaction();
		}

	}
	
	public abstract void freeTransaction();

	

}
