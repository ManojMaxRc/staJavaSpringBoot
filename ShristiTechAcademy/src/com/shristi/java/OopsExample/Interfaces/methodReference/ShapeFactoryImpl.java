package com.shristi.java.OopsExample.Interfaces.methodReference;

public class ShapeFactoryImpl implements ShapeFactory{

	@Override
	public Shape getShape(int x) {
		return new Shape(x);
	}

}
