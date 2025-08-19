package com.inher.quest1;

import java.util.Arrays;

public class CompanyMain {

	public static void main(String[] args) {
		Project project =  new TeamOne();
		project.doTask();
		
		TeamOne  teamOne = (TeamOne) project;
		teamOne.softwaresUsed("Eclipse", "Jenkins", "Maven");
		
		Project project1 = new TeamTwo();
		project1.doTask();
		
		TeamTwo teamTwo = (TeamTwo) project1;
		System.out.println(Arrays.toString(teamTwo.getTechStack()));
	}
}