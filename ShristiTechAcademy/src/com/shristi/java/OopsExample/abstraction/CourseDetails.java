package com.shristi.java.OopsExample.abstraction;

public abstract class CourseDetails {
	
	final String academy = "STA";  //If final variable it should always be initialized

	abstract String[] showCourses();
	
	void certifications() {
		System.out.println("Course details certifications : " + "Java");
		System.out.println("Course details certifications : " + "Cloud");
		instituteDetails();
	}
	
	private void instituteDetails() {
		System.out.println("CD institute details : " + "Chennai");
	}
}
