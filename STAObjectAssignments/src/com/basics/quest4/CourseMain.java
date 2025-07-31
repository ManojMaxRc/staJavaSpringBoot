package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Training training = new Training();
		
		training.showCourse();
		
		System.out.println("Enter the trainers names : ");
		training.showTrainers(input.nextLine());

	}
}
