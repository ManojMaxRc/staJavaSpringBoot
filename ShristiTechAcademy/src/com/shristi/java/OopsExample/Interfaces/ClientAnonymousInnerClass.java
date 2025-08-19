package com.shristi.java.OopsExample.Interfaces;

public class ClientAnonymousInnerClass {

	public static void main(String[] args) {
		
		Payment payment = new Payment() {
			
			@Override
			public String showPaymentMode() {
				return "Payment using Net Banking";
			}
		};
		
		System.out.println(payment.showPaymentMode());
		System.out.println(Payment.CATEGORY);
		
        payment = new Payment() {
			
        	@Override
        	public String showPaymentMode() {
        		return "Payment using Google Pay";
        	}
		};
		
		System.out.println(payment.showPaymentMode());
		
        payment = new Payment() {
			
        	@Override
        	public String showPaymentMode() {
        		return "Debit card payment";
        	}
		};

		System.out.println(payment.showPaymentMode());
	}

}
