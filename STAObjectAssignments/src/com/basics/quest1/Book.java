package com.basics.quest1;

public class Book {
	
	String title;
	String author;
	int price;
	String category;

	public Book(String title, String author, int price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void printDetails() {
		System.out.println("Title : " + title + " Author : " + author + " Price : " + price + " Category : " + category);
	}

	void checkBookType() {
		if(price > 500) {
			System.out.println("Premium book");
		}else {
			System.out.println("Standard book");
		}
	}
}
