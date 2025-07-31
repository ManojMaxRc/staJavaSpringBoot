package com.training.basic;

public class Prime {

	public static void main(String[] args) {

	     printPrimeNumbers(100);
	}

	public static void printPrimeNumbers(int number) {

		int primeCount = 0;
		int currentNum = 2;

		System.out.println("Prime Numbers : ");
			while(primeCount < number) {
				if(isPrimeNumbers(currentNum)) {
					System.out.println(currentNum + " ");
					primeCount++;
			}
				currentNum++;
		}
	}

	public static boolean isPrimeNumbers(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
