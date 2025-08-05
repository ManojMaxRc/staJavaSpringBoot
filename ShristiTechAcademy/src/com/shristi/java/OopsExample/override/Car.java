package com.shristi.java.OopsExample.override;

public class Car extends Vehicle {

	String type = "Sports";
	
	public Car(String company, String model) {
		super(company, model);
	}

	void getMileage() {
		System.out.println("Car mileage");
	}
	
	void showFeatures() {
		System.out.println("Car features");
	}
}
