package com.shristi.java.OopsExample.Interfaces;

public class NetBanking implements Payment {

	@Override
	public String showPaymentMode() {
		return "Payment using Net Banking";
	}

}
