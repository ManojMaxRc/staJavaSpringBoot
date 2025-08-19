package com.shristi.java.OopsExample.Interfaces.lambda;

import java.util.Arrays;

public interface Course {

	String[] courseDetails();
	
	public static void main(String[] args) {
		
		Course course = () ->  new String[] {"Java", "Spring"};
		System.out.println(Arrays.toString(course.courseDetails()));
	}
}