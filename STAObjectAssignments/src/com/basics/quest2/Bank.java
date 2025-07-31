package com.basics.quest2;

public class Bank {

	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	
	void withdraw(double amount) {
				
		if(amount > balance) {
			System.out.println("Insufficient balance");
		}else if(amount <= 0) {
			System.out.println("Invalid amount");
		}else {
			balance = balance - amount;
			System.out.println("Withdrawn amount : " + amount + " Account balance : " + getBalance());
		}
	}
	
	void deposit(double amount) {

		if(amount <= 0) {
			System.out.println("Invalid amount");
		}else {
			balance = balance + amount;
			System.out.println("Deposited amount : " + amount + " Account balance : " + getBalance());
		}
	}
	
	double getBalance() {
		return balance;
	}
}
