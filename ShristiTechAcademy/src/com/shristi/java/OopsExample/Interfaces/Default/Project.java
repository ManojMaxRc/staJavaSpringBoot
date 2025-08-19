package com.shristi.java.OopsExample.Interfaces.Default;

public interface Project {

	void doTask();
	
	//To add new functionality to existing interfaces and can be overridden
	default String[] techStack() {
		return new String[] {"Jenkins", "Git"};
		}
	
	//Common method for all the implementing classes and cannot be overridden
	//Can be called only by using interface name
	static void coursesTaken() {
		System.out.println("Framework training");
	}
}