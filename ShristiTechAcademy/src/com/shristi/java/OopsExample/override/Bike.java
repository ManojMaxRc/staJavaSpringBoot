package com.shristi.java.OopsExample.override;

public class Bike extends Vehicle {

	public Bike(String company, String model) {
		super(company, model);
	}

	@Override
	void getMileage() {
		System.out.println("Bike Mileage");
	}
	
	void showFeatures() {
		System.out.println("Bike features");
	}

}
