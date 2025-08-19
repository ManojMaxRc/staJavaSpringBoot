package com.shristi.java.OopsExample.Interfaces.lambda;

public class AnonymousInnerClassDemo implements Greet{

	public static void main(String[] args) {
		
		System.out.println("Good morning");
		Greet greet = new Greet() {
			
			@Override
			public void greetMessage(String message) {
				System.out.println("Welcome" + message);
				hello();
			}
			
			public void hello() {
				System.out.println("Hello");
			}
		};
		
		System.out.println("Good evening");
		greet.greetMessage("Manoj");

	}

}
