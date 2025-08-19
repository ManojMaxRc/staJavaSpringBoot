package com.shristi.java.OopsExample.Interfaces.lambda;

public class CalculatorMain{

	public static void main(String[] args) {
		
		Calculator calculator = (x, y) -> System.out.println("Add : " + (x + y));
		
		Calculator calculator1 = (x, y) -> System.out.println("Subtract : " + (x - y));
		
		Calculator calculator2 = (x, y) -> System.out.println("Multiply : " + (x * y));
		
		Calculator calculator3 = (x, y) -> System.out.println("Divide : " + (x / y));
		
		calculator.calculate(100, 5);
		calculator1.calculate(100, 5);
		calculator2.calculate(100, 5);
		calculator3.calculate(100, 5);
	}

}
