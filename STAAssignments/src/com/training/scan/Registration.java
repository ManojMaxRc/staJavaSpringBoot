package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		String[] usernames = { "Manoj", "Moni", "Vaisha", "Jim", "Roshan", "Jagan" };

		Scanner input = new Scanner(System.in);

		System.out.println("Enter name to register : ");

		String inputName = input.nextLine().trim().toLowerCase();

		boolean nameExists = false;

		for (String name : usernames) {
			if (name.equalsIgnoreCase(inputName)) {
				nameExists = true;
				break;
			}
		}
		if(nameExists) {
			System.out.println("Name is not unique");
		}else {
			System.out.println("You are registered");
		}
	}
}