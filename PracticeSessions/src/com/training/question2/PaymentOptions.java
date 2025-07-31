package com.training.question2;

public class PaymentOptions {

	void pay(double amount) {
		System.out.println("COD : " + amount);
	}
	
	void pay(long cardNumber, int cvv, double amount) {
		System.out.println("Pay using Card : " + amount);
	}
	
	void pay(String upiId, double amount) {
		System.out.println("Pay using Gpay : " + amount);
	}
	
	void pay(String bankName, String userName, double amount) {
		System.out.println("Pay using Netbanking : " + amount + " for " + "Username : " + userName);
	}
}
