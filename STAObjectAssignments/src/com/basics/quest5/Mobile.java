package com.basics.quest5;

public class Mobile {

	String model;
	String brand;
	String colour;
		
	public Mobile(String model, String brand, String colour) {
		this.model = model;
		this.brand = brand;
		this.colour = colour;
	}

	void getDetails() {
		System.out.println("Brand : " + brand + " Model : "+ model + " Colour : " + colour);
	}
}
