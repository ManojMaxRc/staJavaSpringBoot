package com.shristi.java.OopsExample.Interfaces.Default;

public class TeamTwo implements Project {

	@Override
	public void doTask() {
		System.out.println("Project done by team two");
	}

	@Override
	public String[] techStack() {
		String[] techStack = Project.super.techStack();
		for (String tech : techStack) {
			System.out.println(tech);
		}
		return new String[] {"Java", "Springboot", "Junit"};
	}
	
}
