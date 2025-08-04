package com.training.basic;

public class LargeSecond {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 219, 119, 30, 46, 59, 1, -19, -10};

		System.out.println("Second largest number in the array : " + findSecondLargest(arr));
	}
	
	public static int findSecondLargest(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		if (arr.length < 2) {
            return -1;
		}
		
		for (int num : arr) {
			if(num > largest) {
				secondlargest = largest;
				largest = num;
			}else if (num < largest && num > secondlargest){
				secondlargest = num;
			}
		}
		if(secondlargest == Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}else {
            return secondlargest;
		}
	}
}