package com.shristi.java.OopsExample.Interfaces;

public class UPIPayment implements Payment {

	@Override
	public String showPaymentMode() {
		return "Payment using Google Pay";
	}

}
