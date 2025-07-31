package com.training.scan;

import java.util.Scanner;

public class ScanSmaller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2 : ");
		int num2 = input.nextInt();

		System.out.println("Enter number 3 : ");
		int num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("Smallest number : " + num1);
		}else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Smallest number : " + num2);
		}else {
			System.out.println("Smallest number : " + num3);
		}
	}
}