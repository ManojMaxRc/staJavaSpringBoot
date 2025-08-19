package com.abs.quest1;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calcBonus(double amount) {
		double bonus = amount * 5;
		System.out.println("Team lead class bonus : " + bonus);
	}

	void corporateServices() {
		System.out.println("Team lead class corporate services method");
	}
}
