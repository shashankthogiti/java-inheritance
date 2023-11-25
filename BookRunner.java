package com.in28minutes.oops.level2;

//getting error

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(123, "Object Oriented Programming with java", "Ranga");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awsome", 5));
		System.out.println(book);

	}

}
