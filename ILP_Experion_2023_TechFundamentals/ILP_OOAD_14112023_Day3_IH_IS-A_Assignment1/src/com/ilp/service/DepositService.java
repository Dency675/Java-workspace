package com.ilp.service;

public class DepositService {

	public static void depositMoney(double amount,String slipNo ) {
		System.out.println("Over the counter depositing");
	}
	public static void depositMoney(String chequeNo ) {
		System.out.println("Cheque depositing ");
	}
	public static void depositMoney(String dDNo,String bankBranch ) {
		System.out.println("Demand Draft depositing");
	
	}
}
