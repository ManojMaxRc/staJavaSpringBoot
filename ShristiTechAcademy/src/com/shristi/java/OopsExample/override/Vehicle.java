package com.shristi.java.OopsExample.override;

public class Vehicle {
	
	String type = "Luxury";
	String company;
	String model;

	public Vehicle(String company, String model) {
		this.company = company;
		this.model = model;
	}

	void getMileage() {
		System.out.println("Vehicle Mileage");
	}
}
