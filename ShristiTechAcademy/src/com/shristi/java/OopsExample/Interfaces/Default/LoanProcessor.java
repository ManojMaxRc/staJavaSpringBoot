package com.shristi.java.OopsExample.Interfaces.Default;

public interface LoanProcessor {

	void calculate();
	
	default void Process() {
		System.out.println("Loan Processing");
	}
}
