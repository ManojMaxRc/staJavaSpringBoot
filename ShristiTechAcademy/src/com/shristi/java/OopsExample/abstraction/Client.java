package com.shristi.java.OopsExample.abstraction;

public class Client {

	public static void main(String[] args) {
		
		CourseDetails courseDetails = new WebCourse();
		
		String[] courses = courseDetails.showCourses();
        for (String course : courses) {
			System.out.println("Web courses class showCourses : " + course);
		}
		courseDetails.certifications();
		
		WebCourse webCourse = (WebCourse)courseDetails;
		webCourse.showProjects();
		
		courseDetails = new JavaStack();
		String[] javaStackCourses = courseDetails.showCourses();
		for (String javaStackCourse : javaStackCourses) {
			System.out.println("Java Stack class showCourses : " + javaStackCourse);
		}
		courseDetails.certifications();
		
		JavaStack javaStack =(JavaStack)courseDetails;
		javaStack.printDetails();
		javaStack.courseTypes();
		
		//One more way to access course type from full stack courses
		FullStackCourses fullStackCourses = new JavaStack();
		fullStackCourses.certifications();  //super class method
		fullStackCourses.courseTypes();     //Own method of FullStackCourses

	}

}
