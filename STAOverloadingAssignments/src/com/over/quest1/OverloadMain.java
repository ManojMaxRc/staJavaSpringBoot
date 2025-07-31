package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Employee[] employees = new Employee[5];
		
		for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.println("Enter employee name : ");
    		String name = input.next();
    		
    		System.out.println("Enter employee designation : ");
    		String designation = input.next().trim().toLowerCase();
    		
    		employees[i] = new Employee(name, designation);
    		
    		switch (designation) {
			case "programmer" :
				System.out.println("Enter the basic allowance : ");
				double basicP = input.nextDouble();
				employees[i].calcBonus(basicP);
				break;
				
			case "manager" :
				System.out.println("Enter the basic allowance : ");
				double basicM = input.nextDouble();
				System.out.println("Enter the gift : ");
				String giftM = input.next();
				employees[i].calcBonus(basicM, giftM);
				break;
				
			case "director" :
				System.out.println("Enter the basic allowance : ");
				double basicD = input.nextDouble();
				System.out.println("Enter the gift : ");
				String giftD = input.next();
				System.out.println("Enter the housing allowance : ");
				double housingD = input.nextDouble();
				employees[i].calcBonus(basicD, giftD, housingD);
				break;

			default:
				System.out.println("Input valid employee designation");
				break;
			}
		}
	}
}
