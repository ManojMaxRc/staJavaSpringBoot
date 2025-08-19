package com.shristi.java.OopsExample.staticExample;

import static com.shristi.java.OopsExample.staticExample.Trial.*;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class TrialMain {

	static int x = 100;
	
	static {
		System.out.println("Trial Main Static block 1");
	}
	
	static {
		System.out.println("Trial Main Static block 2");
	}
	
	static void sayHello() {
		System.out.println("Trial Main Static method : Welcome");
	}
	
	public static void main(String[] args) {
		
//		System.out.println(Trial.x);
//		System.out.println(Trial.y);
//		System.out.println(Trial.x + Trial.y);
//		Trial.greet();
		System.out.println(x);
		System.out.println(y);  //First print static block
		System.out.println(x + y);
		greet();
		sayHello();
		
		int a = Integer.parseInt("1000");
		int b = parseInt("2000");  //Imported Integer.Parseint
		System.out.println(a);
		out.println(b);   //Imported System.out
	}
}