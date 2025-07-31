package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int[] arr = {4, 9, 114, 219, 30, 46, 59, 1, -19};
		System.out.println("Smallest number in the array : " + findSmallest(arr));
			}
	
	public static int findSmallest(int[] arr) {
		
		int min = Integer.MAX_VALUE;

		if (arr.length == 0) {
            return -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
            return min;
	}
}