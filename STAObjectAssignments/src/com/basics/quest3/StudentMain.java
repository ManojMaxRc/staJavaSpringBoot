package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter the student " + i + " details : " );
			System.out.println("Enter the student name : ");
			String name = input.next();
			System.out.println("Enter the student department : ");
			String department = input.next();
			
			System.out.println("Enter the number of subjects : ");
			int subjects = input.nextInt();
			int[] marks = new int[subjects];
			
			for (int j = 0; j < marks.length; j++) {
				System.out.println("Enter the marks of subject " + (j + 1) + " : ");
				marks[j] = input.nextInt();
			}
			
			Student student = new Student(name, department);
			student.printDetails();
			
			System.out.println(student.getGrades(marks));
		}		
	}
}
