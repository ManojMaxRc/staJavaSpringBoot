package com.shristi.java.arrays;

public class OneDimArray {

	public static void main(String[] args) {

		//Declare and Initialize
		int[] nums = new int[4];
		System.out.println(nums.length);
		System.out.println(nums[2]);
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
//		nums[4] = 50;   //ArrayIndexOutOfBoundException
		System.out.println(nums[3]);
		System.out.println("Iterate and print");
		
		//For loop to print
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println(nums[i]);
		}
		System.out.println("Sum : " + sum);
		
		//For loop to print
		for (int num : nums) {
			System.out.println(num);
		}
	}
}