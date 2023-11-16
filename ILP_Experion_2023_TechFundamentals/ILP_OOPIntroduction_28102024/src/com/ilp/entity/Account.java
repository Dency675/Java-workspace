package com.ilp.entity;

public class Account {
	
	private String accountNumber; // this is member variable
	private String accountName;
	private double accountBalance;
	
	public void setAccountNumber(String accountNumber){	//this accountNumber is local variable in the function
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber(){
		
		return accountNumber;
	}
	
	public void setAccountName(String accountName){	//this accountNumber is local variable in the function
		this.accountName = accountName;
	}
	
	public String getAccountName(){
		
		return accountName;
	}
	
	public void setAccountBalance(double accountBalance){	//this accountNumber is local variable in the function
		this.accountBalance = accountBalance;
	}
	
	public double getAccountBalance(){
		
		return accountBalance;
	}

}
