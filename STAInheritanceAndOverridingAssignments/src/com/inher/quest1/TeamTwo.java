package com.inher.quest1;

public class TeamTwo extends Project {

	@Override
	void doTask() {
		System.out.println("Team two class : Project implemented using Python");
	}
	
	String[] getTechStack() {
		return new String[] {"Java","Spring","Angular"};
	}
}
