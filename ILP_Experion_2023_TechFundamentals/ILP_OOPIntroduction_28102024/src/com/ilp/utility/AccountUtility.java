package com.ilp.utility;

import com.ilp.entity.Account;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		account.setAccountNumber("ACC100");
		account.setAccountName("Savings Account");
		account.setAccountBalance(10000.00);
		
		System.out.println("Account Number" + "  " +"Account Name"+ "       "+"Account Balance");
		System.out.println(account.getAccountNumber()+ "          "+account.getAccountName()+ "    "+account.getAccountBalance());

	}

}
