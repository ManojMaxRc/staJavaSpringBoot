package com.abs.quest1;

public class Manager extends Employee {

	String activity;
	
	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	void calcBonus(double amount) {
		double bonus = amount * 10;
		System.out.println("Manager class bonus : " + bonus);	
	}

	@Override
	void showProjects() {
		System.out.println("Manager class show project method");
	}
	
	String[] showCourses(){
		 return new String[] {"Management tools", "Product development", "Team leadership"};
	 }

	 void funClub(){
		 System.out.println("Manager class activity : " + activity);
	 }
}