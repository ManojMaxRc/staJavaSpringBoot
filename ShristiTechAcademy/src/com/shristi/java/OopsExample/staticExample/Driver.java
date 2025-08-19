package com.shristi.java.OopsExample.staticExample;

public class Driver {

//	private Driver() {
//		
//	}

	static {
		System.out.println("Driver class is loaded");
	}
	
	void hello() {
		System.out.println("Hello");
	}
	
	static void greet() {
		System.out.println("Good morning");
	}
}
