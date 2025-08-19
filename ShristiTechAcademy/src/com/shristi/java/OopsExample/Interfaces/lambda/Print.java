package com.shristi.java.OopsExample.Interfaces.lambda;

public interface Print {

	void print(String message);
	
	public static void main(String[] args) {
		
		Print print = (message) -> System.out.println(message);
		print.print("Hi Manoj");
	}
}
