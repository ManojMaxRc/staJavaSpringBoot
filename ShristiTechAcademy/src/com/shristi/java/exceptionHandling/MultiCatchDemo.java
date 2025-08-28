package com.shristi.java.exceptionHandling;

public class MultiCatchDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String value = args[0];
			System.out.println("Value : " + value);
			int num = Integer.parseInt(value);
			System.out.println("Num : " + num);
			int result = 100/num;
			System.out.println("Result : " + result);
			int[] marks = null;
			System.out.println(marks[0]);
			//Same hierarchy level exceptions can be used, not subclass and superclass exceptions together
		}catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {   
			System.out.println(e); //if Exception or runtime exception is used here all the sub class exception will not work
			System.out.println("Please enter value greater than zero");
		}catch(RuntimeException e) {
			System.out.println(e);
			System.out.println("Runtime Exception");
		}catch (Exception e) {   //Exception - superclass, Runtime Exception - Subclass, All other exception - sub class of Runtime Exception
			System.out.println(e);            //It will check for specific exception, if not there it goes for 
			System.out.println("Exception");  // superclass -runtime exception if not then goes for superclass -exception
		}
		System.out.println("Task Completed");
	}
}
