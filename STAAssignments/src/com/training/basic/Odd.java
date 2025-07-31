package com.training.basic;

import java.util.stream.IntStream;

public class Odd {

	public static void main(String[] args) {
		
		printOddNumbers(5);

	}
	public static void printOddNumbers(int num) {
		
		//Using for loop
		for (int i = 0; i < num; i++) {
			System.out.println((2 * i) + 1);
			}
		System.out.println("*****************************");
		
		//Using lambda expression
		IntStream.iterate(1, n -> n + 2)
		.limit(5)
		.forEach(System.out::println);
		}		    
}