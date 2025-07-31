package com.over.quest1;

public class Employee {

	String name;
	String designation;
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	void calcBonus(double basicAllowance) {
		System.out.println("1 para constructor");
	}
	
    void calcBonus(double basicAllowance, String gift) {
		System.out.println("2 para constructor");
	}

    void calcBonus(double basicAllowance, String gift, double houseAllowance) {
		System.out.println("3 para constructor");
    }
}
