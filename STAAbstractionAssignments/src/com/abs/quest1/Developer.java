package com.abs.quest1;

import java.util.Arrays;

public class Developer extends TeamLead {
	
	String[] hobbies;

	public Developer(String empName, double salary, int empId, String[] hobbies) {
		super(empName, salary, empId);
		this.hobbies = hobbies;
	}

	@Override
	void showProjects() {
		System.out.println("Developer class calculate bonus method");
	}
	
	void showHobbies() {
		System.out.println("Hobby : " + Arrays.toString(hobbies));
	}
}