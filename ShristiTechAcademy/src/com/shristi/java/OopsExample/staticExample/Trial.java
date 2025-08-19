package com.shristi.java.OopsExample.staticExample;

public class Trial {

	//Static block is always printed first, static variables or methods are equal, 
    //so it is called on our variable or method call
	static int x = 10;
	static int y;
	
	static {
		y = 20;
		System.out.println("Static block 1");
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	static void greet() {
		System.out.println("Static method : Hello");
	}
	
	public static void main(String[] args) {
		greet();
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
}