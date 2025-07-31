package com.training.basic;

public class SmallSecond {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 114, 219, 30, 46, 59, 1, -19, -10};

		System.out.println("Second largest number in the array : " + findSecondSmallest(arr));

	}
	
	public static int findSecondSmallest(int[] arr) {
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		if (arr.length < 2) {
            return -1;
		}

		for (int num : arr) {
			if(num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			}else if (num < secondSmallest && num > smallest) {
				secondSmallest = num;
			}
		}
		
		if(secondSmallest == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
		}else {
            return secondSmallest;
		}
	}
}
