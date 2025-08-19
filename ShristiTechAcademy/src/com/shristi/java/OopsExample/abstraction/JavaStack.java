package com.shristi.java.OopsExample.abstraction;

public class JavaStack extends FullStackCourses {

	@Override
	String[] showCourses(){
		return new String[] {"Java", "Spring", "React"};
	}
	
	final void printDetails() {  //If only final cannot be overridden by spring course subclass, 
//		if private final, the method in subclass is considered as different class
		System.out.println("Java stack class printDetails : " + "Java fullstack");
	}
}

//class SpringCourse extends JavaStack{
//	void printDetails() {
//		System.out.println("Spring course class printDetails : " + "SpringBoot");
//	}
//}
