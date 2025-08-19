package com.shristi.java.OopsExample.abstraction;

public class WebCourse extends CourseDetails {

	@Override
	String[] showCourses(){
		return new String[] {"HTML", "CSS", "JavaScript", "React"};
	}
	
	void showProjects() {
		System.out.println("Web course projects : " + "Contact Forms");
		System.out.println("Web course projects : " + "Static pages");
	}

	@Override
	void certifications() {
		System.out.println("In webcourses");
	}
}