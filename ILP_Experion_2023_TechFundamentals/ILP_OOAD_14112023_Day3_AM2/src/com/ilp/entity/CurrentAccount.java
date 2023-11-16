package com.ilp.entity;

public class CurrentAccount extends Account {

	private String gstNo;

	public CurrentAccount(String accountNo, String accountName, double accountBalace, String gstNo) {
		super(accountNo, accountName, accountBalace);
		this.gstNo = gstNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

}
