package com.training.question1;

import java.lang.classfile.instruction.ReturnInstruction;

public class Mobile {

	String model;
	double price;
	String brand;
	
	public Mobile(String model, double price, String brand) {
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	void getDetails() {
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		System.out.println("Brand : " + brand);
	}
	
	public String[] showFeatures() {
		return new String[]{ "144Hz Display", "Amoled LED Display", "512 Gb Storage",
				"5000 MAH Battery", "Quick Charge with 100 Watts", "200MP Camera"};
		}
}
