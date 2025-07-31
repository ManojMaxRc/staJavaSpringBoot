package com.training.basic;

public class Sum {

	public static void main(String[] args) {
		
		int[] arr = {4, 9, 114, 219, 30, 46, 59, 1};
		
		System.out.println("Sum of all the numbers in array : " + printSum(arr));
		System.out.println("Average of all the numbers in array : " + printaverage(arr, printSum(arr)));
	}
	
	public static int printSum(int[] arr) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		return sum;
	}
	
	public static double printaverage(int[] arr, int sum) {
		
		double average =(double)sum/(arr.length);
		return average;
	}
}
