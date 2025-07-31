package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int[] arr = {1, 4, 9, 114, 219, 30, 46, 59};
		
		System.out.println("Largest element in array : " + findLargest(arr));
	}
	
	public static int findLargest(int[] arr) {
		
		if(arr.length == 0) {
			return -1;
		}
        
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
