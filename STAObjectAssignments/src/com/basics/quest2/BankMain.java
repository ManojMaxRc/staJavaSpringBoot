package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Bank account1 = new Bank(500);
		
		System.out.println("Enter the operation : ");		
		String operation = input.next().trim().toLowerCase();
		
		switch (operation) {
		case "withdraw" :
			System.out.println("Enter the amount to withdraw : ");
			double withdrawAmount = input.nextDouble();
			account1.withdraw(withdrawAmount);
			break;
			
		case "deposit" :
			System.out.println("Enter the amount to deposit : ");
			double depositAmount = input.nextDouble();
			account1.deposit(depositAmount);
			break;
			
		default:
			System.out.println("Input the correct operation");
			break;
		}
	}
}
