package com.shristi.java.OopsExample.Interfaces.Default;

public class Employee implements BonusCalculator, LoanProcessor {

	@Override
	public void calculate() {
		System.out.println("Bonus is calculated for employee");

	}

	@Override
	public void Process() {
		BonusCalculator.super.Process();
	}
}