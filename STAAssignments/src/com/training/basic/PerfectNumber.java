package com.training.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		
		printPerfectNumber(5);
	}
	
	public static void printPerfectNumber(int num) {
		
		int count = 0;
		
		while(count <= 400000000) {
			if(perfectNumber(num)) {
				System.out.println(num + " ");
				count++;
			}
			num++;
		}
	}
	
	public static boolean perfectNumber(int num) {
		
		int sum = 0;
		
		for (int i = 1; i <= num/2 ; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}		
		return (sum == num);
	}
}