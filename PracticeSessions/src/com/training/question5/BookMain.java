package com.training.question5;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book("IKIGAI");
		
		Book book2 = new Book("Rich Dad Poor Dad", 300);
		
		Book book3 = new Book("Atomic Habits", "James Clear", 400);
		
		book1.printDetails();
		book2.printDetails();
		book3.printDetails();
	}
}
