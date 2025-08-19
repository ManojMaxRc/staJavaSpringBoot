package com.shristi.java.OopsExample.Interfaces;

public class Client {

	public static void main(String[] args) {
		
		Payment payment = new NetBanking();
		System.out.println(payment.showPaymentMode());
		System.out.println(Payment.CATEGORY);

		payment = new CreditCard();
		System.out.println(payment.showPaymentMode());
		
		payment = new DebitCard();
		System.out.println(payment.showPaymentMode());  //For over ridden methods it uses object reference
		
		DebitCard debitCard = (DebitCard) payment;  //For own method downcast to that child class reference
		debitCard.showOffers();
	}

}
