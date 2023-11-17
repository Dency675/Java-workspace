package com.ilp.entity;

import java.util.ArrayList;

public class SavingsMaxAccount extends Product {

	private int minimumBalance = 1000;

	public SavingsMaxAccount(String productCode, String productName, ArrayList<Services> serviceList) {
		super(productCode, productName, serviceList);
	}

	public int getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

}
