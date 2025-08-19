package com.shristi.java.OopsExample.abstraction.example;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		System.out.println("Sub Branch class : Car loan");		
	}
	
	void depositTypes() {
		System.out.println("Sub Branch class : Deposit type");
	}
}
