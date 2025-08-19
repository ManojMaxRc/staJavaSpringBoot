package com.shristi.java.OopsExample.Interfaces.Default;

public interface BonusCalculator {

	void calculate();
	
	default void Process() {
		System.out.println("Bonus Processing");
		check();
	}
	
	private void check() {
		System.out.println("Check documents");
	}
}
