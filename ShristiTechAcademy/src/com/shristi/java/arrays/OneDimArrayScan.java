package com.shristi.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimArrayScan {

	public static void main(String[] args) {
		int[] nums = new int[4];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		
		for (int num : nums) {
		    System.out.println(num);	
		}
//		System.out.println(Arrays.toString(nums));
	}
}
