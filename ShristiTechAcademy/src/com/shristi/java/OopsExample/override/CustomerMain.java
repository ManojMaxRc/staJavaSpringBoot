package com.shristi.java.OopsExample.override;

import java.util.Arrays;

public class CustomerMain {

	public static void main(String[] args) {
		
		GroupOne groupOne = new GroupOne("Manoj", 10, "TL1");
		groupOne.projectAssigned();
		groupOne.showTools();
		
		GroupTwo groupTwo = new GroupTwo("Jagan", 5, "TL2");
		groupTwo.projectAssigned();
		groupTwo.coursesAssigned("Python", "C++", "React");

	}

}
