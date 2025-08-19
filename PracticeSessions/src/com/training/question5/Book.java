package com.training.question5;

public class Book {

	String title;
	String author;
	int bookId;
	int price;
	
	public Book(String title) {
		this.title = title;
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void printDetails() {
		System.out.println("Title : " + title + " Author : " + author + " Price : " + price);
	}
}