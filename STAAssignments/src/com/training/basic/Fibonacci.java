package com.training.basic;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		printFibonacciNumber(100);
	}
	
	public static void printFibonacciNumber(int num) {
		
		BigInteger first = BigInteger.ZERO;
		BigInteger second = BigInteger.ONE;
		
		System.out.println("First " + num + " fibonacci numbers : ");
				
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " : " + first);
		     
			BigInteger next = first.add(second);
		    first = second;
		    second = next;
		}
	}

}
