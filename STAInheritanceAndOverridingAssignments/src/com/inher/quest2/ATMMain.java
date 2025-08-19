package com.inher.quest2;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select an account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice 1 or 2: ");
        int accountTypeChoice = input.nextInt();
        
        Account userAccount = null;
        if(accountTypeChoice == 1) {
        	userAccount = new Savings(2000);
        }else if (accountTypeChoice == 2) {
			userAccount = new Current(3000);
		}else {
			System.out.println("Invalid account type");
		}
        
        int choice = 0;
        while (choice != 4) {
        	System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
			
            choice = input.nextInt();
            
            switch (choice) {
			case 1:
				System.out.println("Enter the amount to withdraw : ");
				double withdrawAmount = input.nextDouble();
				userAccount.withdraw(withdrawAmount);
				break;
				
			case 2:
				System.out.println("Enter the amount to deposit : ");
				double depositAmount = input.nextDouble();
				userAccount.deposit(depositAmount);
				break;
				
			case 3:
				System.out.println("Balance : " + userAccount.getBalance());
				break;
			
			case 4:
				System.out.println("Thank you for using ATM");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}