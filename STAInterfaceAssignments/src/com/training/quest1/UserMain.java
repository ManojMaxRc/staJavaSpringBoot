package com.training.quest1;

import java.util.Arrays;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Institute course choices : S - Student courses, E - Employee courses");
		
		String choice = input.next().toUpperCase();
		
		switch (choice) {
		case "S":
			Institute institute = new StudentCourses();
			System.out.println(Arrays.toString(institute.showCourses()));
			break;

		case "E":
			Institute institute1 = new EmployeeCourses();
			System.out.println(Arrays.toString(institute1.showCourses()));
			break;
		default:
			System.out.println("Invalid institute course choice");
			break;
		}		
	}
}