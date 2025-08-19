package com.shristi.java.OopsExample.abstraction.example;

public class Branch2 extends Bank{

	@Override
	void housingLoan() {
		System.out.println("Branch 2 class : Housing loan");
	}

	@Override
	void educationLoan() {
		System.out.println("Branch 2 class : Education loan");
	}

	void loanTypes() {
		System.out.println("Branch 2 class : Loan type");
	}
}
