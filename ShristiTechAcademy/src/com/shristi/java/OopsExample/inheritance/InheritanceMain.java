package com.shristi.java.OopsExample.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		InEmployee employee = new InEmployee("Manoj", 10);
		employee.getDetails();
		
		InManager manager = new InManager("Monisha", 7, 20000);
		manager.getDetails();

	}

}
