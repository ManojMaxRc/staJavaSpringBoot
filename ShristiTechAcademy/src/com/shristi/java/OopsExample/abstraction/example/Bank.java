package com.shristi.java.OopsExample.abstraction.example;

public abstract class Bank {

	abstract void carLoan();
	
	abstract void housingLoan();
	
	abstract void educationLoan();
	
	final void adminDetails() {
		System.out.println("Bank class : Admin details");
	}
}
