package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book("Java", "Manoj", 700, "Education");
		
		Book book2 = new Book("Python", "Jagan", 400, "Education");
		
		book1.printDetails();
		book1.checkBookType();
		
		book2.printDetails();
		book2.checkBookType();
	}
}
