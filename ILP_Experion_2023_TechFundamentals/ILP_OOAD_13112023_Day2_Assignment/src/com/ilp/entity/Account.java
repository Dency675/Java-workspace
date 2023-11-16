package com.ilp.entity;

import java.util.ArrayList;

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

}
