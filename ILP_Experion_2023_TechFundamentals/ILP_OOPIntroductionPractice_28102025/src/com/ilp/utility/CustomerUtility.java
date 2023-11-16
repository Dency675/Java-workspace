package com.ilp.utility;

import com.ilp.entity.Customer;

public class CustomerUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		customer.setCustomerCode("CS100");
		customer.setCustomerName("Suneesh");
		customer.setDob("23/03/1990");
		customer.setContactNo("3353876542");
		customer.setPincode(345245);
		customer.setOpenDate("23/10/2023");
		
		System.out.println("Customer Code"+"   "+"Customer Name"+"   "+"DOB"+"          "+"Contact No"+"   "+"Pincode"+"   "+"Open Date");
		System.out.println(customer.getCustomerCode()+"           "+customer.getCustomerName()+"         "+customer.getDob()+"   "+customer.getContactNo()+"   "+customer.getPincode()+"    "+customer.getOpenDate());
		
		customer.setCustomerCode("CS101");
		customer.setCustomerName("Sudeesh");
		customer.setDob("23/04/1990");
		customer.setContactNo("9253236572");
		customer.setPincode(342345);
		customer.setOpenDate("27/10/2023");
		
		System.out.println(customer.getCustomerCode()+"           "+customer.getCustomerName()+"         "+customer.getDob()+"   "+customer.getContactNo()+"   "+customer.getPincode()+"    "+customer.getOpenDate());
		
	}

}
