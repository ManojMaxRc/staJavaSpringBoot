package com.inher.quest2;

public class Account {

	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	void withdraw(double amount){
		System.out.println("Account class withdraw method");
	}
	
	void deposit(double amount){
		System.out.println("Account class deposit method");
	}
	
	double getBalance(){
		return balance;
	}
}