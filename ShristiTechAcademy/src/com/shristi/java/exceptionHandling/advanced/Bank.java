package com.shristi.java.exceptionHandling.advanced;

public class Bank {

	int balance = 5000;
	void withdraw(int amount) throws Exception{  //If we have Super class compile time Exception, 
		System.out.println("In bank class");     //we need to use throws keyword
		try {
			if(amount <= 0) {
				throw new Exception("Amount should be greater than zero");
			}
		} catch (Exception e) {
			System.out.println("Technical Error");
			System.out.println(e.getMessage());
			throw e;  //Re throwing exception again
		}finally {
			System.out.println("Close exception");
		}		
		System.out.println("Task Completed");
	}
}
