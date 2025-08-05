package com.shristi.java.arrays;

import java.util.Scanner;

public class TwoDimArrayScan {

	public static void main(String[] args) {
		int[][] marks = new int[3][2];
		System.out.println(marks.length);
		
//		marks[0][0] = 10;
//		marks[0][1] = 20;
//		
//		marks[1][0] = 30;
//		marks[1][1] = 40;
//
//		marks[2][0] = 50;
//		marks[2][1] = 60;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				marks[i][j] = input.nextInt();
			}
		}
		
		for (int[] one : marks) {
	        for (int mark : one) {
				System.out.print(mark + " ");
			}
		}
		input.close();
	}

}
