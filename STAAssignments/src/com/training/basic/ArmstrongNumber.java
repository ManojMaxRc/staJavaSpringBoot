package com.training.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println(isArmstrongNumber(num));
        
        for(int i = 100; i < 1000; i++){
            if(isArmstrongNumber(i)){
                System.out.println("Armstrong numbers : " + i);
            }
        }
	}
	
	public static boolean isArmstrongNumber(int num) {
		
		int sum = 0;
		int original = num;
		
		for (int i = 100; i < 1000; i++) {
			while(num != 0) {
				int remainder = num % 10;
				sum += (remainder * remainder * remainder);
				num = num /10;
			}
		}
		return(original == sum);
	}
}