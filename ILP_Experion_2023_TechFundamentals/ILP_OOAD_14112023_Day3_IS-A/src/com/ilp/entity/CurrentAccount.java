package com.ilp.entity;

public class CurrentAccount extends Account {

	private String gstNo;

	public CurrentAccount(String accountNo, int balance, Product product, String gstNo) {
		super(accountNo, balance, product);
		this.gstNo = gstNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

}
