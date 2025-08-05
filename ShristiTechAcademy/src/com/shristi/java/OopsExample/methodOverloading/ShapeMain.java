package com.shristi.java.OopsExample.methodOverloading;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(10);
		shape.area(20f);
		int rectangle = shape.area(10, 20);
		System.out.println("Rectangle Area : " + rectangle);
		double triangle = shape.area(10, 20f);
		System.out.println("Triangle Area : " + triangle);
	}

}
