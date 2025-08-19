package com.shristi.java.OopsExample.Interfaces.Default;

public class Client {

	public static void main(String[] args) {
		
		Project project = new TeamOne();
		project.doTask();
		String[] techStack = project.techStack();
		for (String tech : techStack) {
			System.out.println(tech);
		}
		
		project = new TeamTwo();
		project.doTask();
		techStack = project.techStack();
		for (String tech : techStack) {
			System.out.println(tech);
		}
		
		Project.coursesTaken();
	}

}
