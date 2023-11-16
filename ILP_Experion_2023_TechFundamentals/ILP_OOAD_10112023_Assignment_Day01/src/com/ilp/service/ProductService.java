package com.ilp.service;

import com.ilp.entity.Product;

public class ProductService {

	public static Product createProduct() {
		// TODO Auto-generated method stub
		Product product = new Product("AB100","Product1",100);
		
		return product;
	}

	public static void displayProduct(Product product) {
		// TODO Auto-generated method stub
		
		System.out.println("Product Code"+"\t"+"Product Name"+"\t"+"Product Price");
		System.out.println(product.getProductCode()+"\t"+product.getProductName()+"\t"+product.getProductPrice());

	}

}
