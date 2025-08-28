package com.training.quest6;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the restaurant cuisine : 1.International 2.Indian ");

		int cuisineChoice = input.nextInt();

		Cuisine cuisine = null;

		if (cuisineChoice == 1) {
			cuisine = new International();
			System.out.println("Enter the menu choice : 1.Starters 2.Maincourse 3.Dessert");

			String menuChoice = input.next().toUpperCase();
			switch (menuChoice) {
			case "STARTERS":
				System.out.println(Arrays.toString(cuisine.showMenus(menuChoice)));
				break;
			case "MAINCOURSE":
				System.out.println(Arrays.toString(cuisine.showMenus(menuChoice)));
				break;
			case "DESSERT":
				System.out.println(Arrays.toString(cuisine.showMenus(menuChoice)));
				break;

			default:
				System.out.println("Invalid international menu choice");
				break;
			}
		} else if (cuisineChoice == 2) {
			cuisine = new Indian();
			System.out.println("Enter the menu choice : 1.Starters 2.Maincourse 3.Dessert");

			String menuChoice = input.next().toUpperCase();
			switch (menuChoice) {
			case "STARTERS":
				System.out.println(Arrays.toString(cuisine.showMenus(menuChoice)));
				break;
			case "MAINCOURSE":
				System.out.println(Arrays.toString(cuisine.showMenus(menuChoice)));
				break;
			case "DESSERT":
				System.out.println(Arrays.toString(cuisine.showMenus(menuChoice)));
				break;

			default:
				System.out.println("Invalid indian menu choice");
				break;
			}
		}
	}
}