package com.over.quest3;

public class Processor {

	void calculate(double x) {
		double sqRoot = Math.sqrt(x);
		System.out.println(sqRoot);
	}
	
    void calculate(int x, int y) {
		int product = x * y;
		System.out.println(product);
	}

    void calculate(double x, double y) {
	    double difference = x - y;
	    System.out.println(difference);
    }

    void calculate(double x, int y) {
	    double power = Math.pow(x, y);
	    System.out.println(power);
    }

    void calculate(int x) {
	    int square = x * x;
	    System.out.println(square);
    }
}
