package com.in28minutes.oops.level2;

//getting error

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String author) {
		this.id = id;
		this.author = author;
		this.name = name;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id - %d , name - %s , author - %s , reviews - %s", id, name, author, reviews);
	}
}
