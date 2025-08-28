package com.shristi.java.exceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String value = args[0];
			System.out.println("Value : " + value);
			int num = Integer.parseInt(value);
			System.out.println("Num : " + num);
			int result = 100/num;
			System.out.println("Result : " + result);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Task Completed");
	}
}
