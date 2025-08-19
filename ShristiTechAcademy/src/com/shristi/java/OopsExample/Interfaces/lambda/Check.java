package com.shristi.java.OopsExample.Interfaces.lambda;

public interface Check {

	int showNumbers();
	
	public static void main(String[] args) {
		
		Check check = () -> 100;
		System.out.println(check.showNumbers());
	}
}
