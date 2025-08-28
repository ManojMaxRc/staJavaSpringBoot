package com.training.quest5;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the phone choice : ");
		
		String choice = input.next().toUpperCase();
		
		switch (choice) {
		case "B":
			FeaturePhone phone = new BasicMobile();
			phone.call();
			phone.messaging();
			break;
			
		case "C":
			SmartPhone phone1 = (SmartPhone) new TouchScreenMobile();
			phone1.call();
			phone1.messaging();
			phone1.showApps();
			phone1.cameraTypes();
			break;			

		default:
			System.out.println("Invalid phone choice");
			break;
		}
	}
}
