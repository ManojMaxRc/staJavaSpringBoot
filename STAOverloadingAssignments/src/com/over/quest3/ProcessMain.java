package com.over.quest3;

public class ProcessMain {

	public static void main(String[] args) {
		
		Processor processor = new Processor();
		
		processor.calculate(144.49);
		processor.calculate(10,7);
		processor.calculate(155.98, 132.99);
		processor.calculate(4.0, 2);
		processor.calculate(10);
	}
}
