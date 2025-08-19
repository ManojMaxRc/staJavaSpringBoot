package com.shristi.java.OopsExample.encapsulation;

public class ProductMain {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductName("Iphone 17 Pro Max");
		product.setProductId(1);
		product.setPrice(100000);
		product.setExpired(false);
		
		System.out.println(product);
	}
}