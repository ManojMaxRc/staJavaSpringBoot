package com.shristi.java.exceptionHandling.userDefinedException;

public class A {

	public static void main(String[] args) {
		System.out.println("Started");
		try {
			B.method1();
		} catch (Exception e) {
			System.out.println("Technical Glitch");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("In Class A");
		}
		System.out.println("Completed");
	}
}

class B{
	static void method1() throws Exception{
		System.out.println("Hi");
			try {
				C.method2();
			}finally {
				System.out.println("Close resource B");
			}
		System.out.println("In Class B");
	}
}

class C{
static void method2() throws Exception{
		System.out.println("Hello");
		try {
			D.method3();
		} catch (Exception e) {
			System.out.println("Technical Error");
			System.out.println(e.getMessage());
//			System.exit(0);      //Program will be terminated and in this case alone finally will not be printed
//			throw e;   //if throw or return is written only finally will be printed before going to calling method
//			return;    //
		}finally {
			System.out.println("Close resource C");
		}
		System.out.println("In Class C");
	}
}

class D{
static void method3() throws Exception{
		System.out.println("Welcome");
		throw new Exception("Invalid user name or password");
	}
}
