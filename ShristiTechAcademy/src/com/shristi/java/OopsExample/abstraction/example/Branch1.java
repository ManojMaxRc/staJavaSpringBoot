package com.shristi.java.OopsExample.abstraction.example;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Branch 1 class : Car loan");		
	}

	@Override
	void housingLoan() {
		System.out.println("Branch 1 class : Housing loan");
	}

	@Override
	void educationLoan() {
		System.out.println("Branch 1 class : Education loan");
	}
	
	void payDetails() {
		System.out.println("Branch 1 class : Pay details");
	}
}
