package com.abs.quest1;

import java.util.Arrays;
import java.util.Scanner;

public class DemoAbsMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Employee employee = null;
		
		System.out.println("Enter the employee choice : ");
		int employeeChoice = input.nextInt();
		
		switch (employeeChoice) {
		case 1:
			employee = new Manager("Manoj", 50000, 1, "Dance");
			employee.calcBonus(500);
			employee.showProjects();
			System.out.println(Arrays.toString(employee.showCourses()));
			Manager employeeManager = (Manager) employee;
			employeeManager.funClub();
			break;
			
		case 2:
			employee = new Developer("Monisha", 100000, 2, new String[] {"Art", "Singing", "Dance"});
			employee.showProjects();
			Developer employeeDeveloper = (Developer) employee;
			employeeDeveloper.showHobbies();
			break;
			
		case 3:
			TeamLead employeeTeamLead = (TeamLead) new Developer("Vaisha", 70000, 3, null);
			employeeTeamLead.calcBonus(500);
			employeeTeamLead.corporateServices();
			break;
			
		default:
			System.out.println("Invalid employee choice input");
			break;
		}
	}
}