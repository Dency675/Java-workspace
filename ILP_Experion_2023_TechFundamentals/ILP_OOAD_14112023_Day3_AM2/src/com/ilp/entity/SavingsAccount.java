package com.ilp.entity;

public class SavingsAccount extends Account {

	private String roi;

	public SavingsAccount(String accountNo, String accountName, double accountBalace, String roi) {
		super(accountNo, accountName, accountBalace);
		this.roi = roi;
	}

	public String getRoi() {
		return roi;
	}

	public void setRoi(String roi) {
		this.roi = roi;
	}

}
