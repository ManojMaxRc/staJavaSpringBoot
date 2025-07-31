package com.basics.quest4;

public class Training {

	String[] showCourse() {
		
		String[] courses = {"Java", "Python", "React", "SprinBoot"};
		
		for (String course : courses) {
			System.out.println(course);
		}
		return courses;
	}

	void showTrainers(String... names) {
		
		if(names == null || names.length == 0) {
			System.out.println("No trainer names provided");
		}
		
		for (String trainerName : names) {
			System.out.println("Trainer names : " + trainerName + " ");
		}
	}
}
