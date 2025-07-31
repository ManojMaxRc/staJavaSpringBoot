package com.training.question2;

public class Customer {

	public static void main(String[] args) {
		PaymentOptions paymentOptions = new PaymentOptions();
		paymentOptions.pay(1000);
		paymentOptions.pay("manoj@hdfcbank", 2000);
		paymentOptions.pay(123456789, 123, 3000);
		paymentOptions.pay("HDFC Bank", "Manoj", 4000);
	}
}
