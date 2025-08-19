package com.inher.quest2;

public class Current extends Account{
	
	static double overdraftLimit = 2000;

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if(getBalance() + overdraftLimit < amount) {
			System.out.println("Current Class Withdraw method : Withdrawl failed, exceeds overdraft limit : " + overdraftLimit);
		}else {
			balance = balance - amount;
			System.out.println("Current Class Withdraw method Balance : " + balance);
		}
	}

	@Override
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Current Class Deposit method Balance : " + balance + " Deposited amount : " + amount);
	}
}