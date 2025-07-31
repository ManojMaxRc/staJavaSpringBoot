package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String[] usernames = { "Manoj", "Moni", "Vaisha", "Jim", "Roshan", "Jagan" };

		Scanner input = new Scanner(System.in);

		System.out.println("Enter name to login : ");

		String loginName = input.nextLine().trim().toLowerCase();

		boolean nameExists = false;

		for (String name : usernames) {
			if (name.equalsIgnoreCase(loginName)) {
				nameExists = true;
				break;
			}
		}
		if(nameExists) {
			System.out.println("You are logged in successfully");
		}else {
			System.out.println("Invalid username");
		}


	}

}
