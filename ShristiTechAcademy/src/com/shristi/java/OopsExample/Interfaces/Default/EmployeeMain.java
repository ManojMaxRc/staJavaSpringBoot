package com.shristi.java.OopsExample.Interfaces.Default;

public class EmployeeMain {

	public static void main(String[] args) {

		BonusCalculator bonusCalculator = new Employee();
		bonusCalculator.calculate();
		bonusCalculator.Process();
		
		LoanProcessor loanProcessor = (LoanProcessor) bonusCalculator;
		loanProcessor.calculate();

	}

}
