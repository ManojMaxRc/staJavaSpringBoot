package com.shristi.java.exceptionHandling.advanced;

public class ATMMain {

	public static void main(String[] args) {    //Use throws keyword - throws Exception
		System.out.println("In ATM class");
		
		Bank bank = new Bank();
		try {                                  
			bank.withdraw(0);
		} catch (Exception e) {     //To handle exception, if we want JVM to handle exception use throws in main
			System.out.println("Technical glitch");
		}
		System.out.println("Completed");
	}
}
