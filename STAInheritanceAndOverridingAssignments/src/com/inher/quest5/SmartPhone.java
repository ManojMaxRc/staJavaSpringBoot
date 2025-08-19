package com.inher.quest5;

public class SmartPhone extends Mobile {

	void call() {
		System.out.println("Smart phone class call method");
	}
	
	String[] apps(){
		return new String[] {"Facebook", "Instagram", "Whatsapp", "Twitter"};
	}
}
