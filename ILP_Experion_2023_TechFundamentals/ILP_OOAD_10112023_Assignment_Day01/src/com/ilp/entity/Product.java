package com.ilp.entity;

public class Product {

	private String productCode;
	private String productName;
	private double productPrice;

	public Product(String productCode, String productName, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}
	
	
}
