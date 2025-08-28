package com.shristi.java.OopsExample.Interfaces.methodReference;

public class Shape {
	
    int x;
	
	public Shape(int x) {
		super();
		this.x = x;
	}

	void area() {
		System.out.println("Square : " + (x * x));
	}
}
