package com.shristi.java.exceptionHandling.userDefinedException;

public class ATMMainUserDefined {

	public static void main(String[] args) {    //Use throws keyword - throws Exception
		System.out.println("In ATM class");
		
		BankAccount bank = new BankAccount(10000);
		try {                                  
			bank.withdraw(9000);
			System.out.println("Amount withdrawn successfully");
		} catch (InsufficientBalanceException | ExceedingLimitsException e) {
			//To handle exception, if we want JVM to handle exception use throws in main
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Completed");
	}
}
