package com.ilp.entity;

public class Account {
	private String accountNo;
	private int balance;
	private Product product;

	public Account(String accountNo, int balance, Product product) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.product = product;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}

	public int withdraw(int withdrawAmount) {
		this.balance -= withdrawAmount;
		return balance;
	}
}
