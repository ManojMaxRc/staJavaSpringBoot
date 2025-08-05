package com.shristi.java.arrays;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the details : ");
		String empName = input.next();
		System.out.println("Name : " + empName);
		int empId = input.nextInt();
        System.out.println("ID : " + empId);
        double salary = input.nextDouble();
        System.out.println("Salary : " + salary);
	}

}
