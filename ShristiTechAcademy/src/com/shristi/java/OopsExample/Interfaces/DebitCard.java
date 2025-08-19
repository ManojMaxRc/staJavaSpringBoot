package com.shristi.java.OopsExample.Interfaces;

public class DebitCard extends CardPayment {

	@Override
	public String showPaymentMode() {
		return "Debit card payment";
	}
	
	void showOffers() {
		System.out.println("1000 off on debit cards");
	}

}
