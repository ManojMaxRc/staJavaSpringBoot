package com.training.question1;

import java.util.Arrays;

public class MobMain {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile("Iphone 17", 90000, "Apple");

		Mobile mobile2 = new Mobile("Galaxy S25 Ultra", 100000, "Samsung");

		System.out.println("Mobile 1 Details : ");
		mobile1.getDetails();

		System.out.println();
		
		System.out.println("Mobile 2 Details : ");
		mobile2.getDetails();
		
		System.out.println();
		
		System.out.println("Features : " + Arrays.toString(mobile1.showFeatures()));
	}
}
