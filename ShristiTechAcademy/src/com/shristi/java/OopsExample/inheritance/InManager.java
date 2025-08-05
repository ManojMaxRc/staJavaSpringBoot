package com.shristi.java.OopsExample.inheritance;

public class InManager extends InEmployee {
	
	double salary;
	
	public InManager(String empName, int empID, double salary) {
		super(empName, empID);
		this.salary = salary;
    }
}