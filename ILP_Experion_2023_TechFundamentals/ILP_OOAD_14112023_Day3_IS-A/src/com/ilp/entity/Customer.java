package com.ilp.entity;

import java.util.ArrayList;

public class Customer {
	private String customerCode;
	private String CustomerName;
	private ArrayList<Account> accountList;

	public Customer(String customerCode, String customerName, ArrayList<Account> accountList) {
		this.customerCode = customerCode;
		this.CustomerName = customerName;
		this.accountList = accountList;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

}
