package com.shristi.java.OopsExample.override;

public class GroupTwo extends Project{

	public GroupTwo(String clientName, int duration, String tlName) {
		super();
		this.clientName = clientName;
		this.duration = duration;
		this.tlName = tlName;
	}

	void projectAssigned() {
		System.out.println("Group 2 Projects");
	}
	
	void coursesAssigned(String... courses) {
		for (String course : courses) {
			System.out.println(course);
		}
	}
}
