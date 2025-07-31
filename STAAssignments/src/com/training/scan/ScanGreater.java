package com.training.scan;

import java.util.Scanner;

public class ScanGreater {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2 : ");
		int num2 = input.nextInt();

		System.out.println("Enter number 3 : ");
		int num3 = input.nextInt();
		
		int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		
		System.out.println("Greatest number : " + max);
	}

}
