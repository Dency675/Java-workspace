package com.ilp.entity;

public class Account {
	private String accountNo;
	private String accountName;
	private double accountBalace;

	// constructor called implicitly when the object of a class instantiated
	// It is like a function, but it doesn't return anything

	public Account(String accountNo, String accountName, double accountBalace) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBalace = accountBalace;
	}

	// Right click -> source -> Generate getters and setters

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalace() {
		return accountBalace;
	}

	public void setAccountBalace(double accountBalace) {
		this.accountBalace = accountBalace;
	}
}
