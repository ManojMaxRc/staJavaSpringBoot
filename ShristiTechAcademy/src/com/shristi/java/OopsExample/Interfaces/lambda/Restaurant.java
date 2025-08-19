package com.shristi.java.OopsExample.Interfaces.lambda;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter the menu choice : 1. Chinese  2. Indian");
		
		int choice = inputScanner.nextInt();
		
		switch (choice) {
		case 1:
			Menu menu = (chineseMenu) -> {
				return new String[] {"Fried rice", "Noodles"};
			};
			String[] chineseMenu = menu.showMenu("Chinese");
			System.out.println(Arrays.toString(chineseMenu));
			break;
			
		case 2:
			Menu menu1 = (indianMenu) -> {
				return new String[] {"Dosa", "Idli"};
			};
			String[] indianMenu = menu1.showMenu("Indian");
			System.out.println(Arrays.toString(indianMenu));
			break;

		default:
			System.out.println("Invalid menu choice");
			break;
		}	
	}
}