package com.training.basic;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {4, 9, 114, 219, 30, 46, 59, 1, -19};
		sortArrayAsc(arr);
	}
	
	public static void sortArrayAsc(int[] arr) {
		
		if(arr.length == 0 || arr == null) {
			System.out.println("Array is empty");
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
			}
				int temp =  arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
