package com.shristi.java.OopsExample.Interfaces.methodReference;

import java.io.ObjectInputStream.GetField;

public class ShapeMethodReferenceDemo {

	public static void main(String[] args) {
		
		//Class that implements interface
		ShapeFactory shapeFactory = new ShapeFactoryImpl();
		//Get shape from factory class
		Shape shape = shapeFactory.getShape(10);
		shape.area();
		
		//Lambda expression
		ShapeFactory shapeFactory1 = x -> new Shape(x);
		//Get the shape from shape factory
		Shape shape1 = shapeFactory1.getShape(20);
		shape1.area();
		
		//Method reference, referring to a constructor to get the object
		ShapeFactory shapeFactory2 = Shape :: new;
		Shape shape2 = shapeFactory.getShape(30);
		shape2.area();
	}
}
