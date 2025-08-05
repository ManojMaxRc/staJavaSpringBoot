package com.shristi.java.OopsExample.constructorExample;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("Manoj", "MECH");
		Student student1 = new Student("Moni", "IT");
		Student student2 = new Student("Vaisha", "CSC");
		
		student.getDetails();
		student1.getDetails();
		student2.getDetails();
		
	}

}
