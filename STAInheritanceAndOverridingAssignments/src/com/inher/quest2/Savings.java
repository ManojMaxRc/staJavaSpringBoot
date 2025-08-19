package com.inher.quest2;

public class Savings extends Account{

	static double minimumBalance = 1000;
	
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if(getBalance() - amount < minimumBalance) {
			System.out.println("Savings Class Withdraw method : Withdrawl failed, maintain minimum balance " + minimumBalance);
		}else {
			balance = balance - amount;
			System.out.println("Savings Class Withdraw method Balance : " + balance + " Whitdrawn amount : " + amount);
		}
	}

	@Override
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Savings Class Deposit method Balance : " + balance + " Deposited amount : " + amount);
	}
}