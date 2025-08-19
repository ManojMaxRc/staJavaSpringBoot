package com.shristi.java.OopsExample.staticExample;

public class DBConnection extends Driver{
	
	void hello() {
		System.out.println("Hi");
	}
	
	static void greet() {
		System.out.println("Good evening");
	}

	public static void main(String[] args) {
		
		Driver driver =  new DBConnection();
		driver.hello();         //for non static methods the object reference is used to call the method - Hi
		
		Driver driver2 = new DBConnection();
		driver2.greet();   		//for static method the class reference is used to call the method - Good morning
		
//		Driver driver3 = new Driver();
//		driver3.hello();       //Hello
//		
//		DBConnection dbConnection = new DBConnection();
//		dbConnection.greet();  //Good evening
		
//		Driver driver = new Driver(); use when constructor is not private
		
		try {
			Class.forName("com.shristi.java.OopsExample.staticExample.Driver");  //To print static block when construtor is private
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}