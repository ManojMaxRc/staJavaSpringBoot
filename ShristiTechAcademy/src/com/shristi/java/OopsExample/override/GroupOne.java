package com.shristi.java.OopsExample.override;

import java.util.Arrays;

public class GroupOne extends Project{

	public GroupOne(String clientName, int duration, String tlName) {
		super();
		this.clientName = clientName;
		this.duration = duration;
		this.tlName = tlName;
	}

	void projectAssigned() {
		System.out.println("Group 1 Projects");
	}
	
	String[] showTools() {
		String[] tools = {"Java", "Springboot", "SQL"};
		System.out.println(Arrays.toString(tools));
		return tools;
	}
}
