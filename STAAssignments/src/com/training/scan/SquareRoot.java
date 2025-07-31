package com.training.scan;

import java.util.Arrays;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Array : " + Arrays.toString(arr));
		
		System.out.println("Square root of the array : " + Arrays.toString(findSquareRoot(arr)));
	}
	
	public static int[] findSquareRoot(int[] arr) {
		
		int[] newArraySquareRoot = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.sqrt(arr[i]);
		}
		
		for (int i = 0; i < newArraySquareRoot.length; i++) {
			newArraySquareRoot[i] = arr[i];
		}
		return newArraySquareRoot;
	}
}
