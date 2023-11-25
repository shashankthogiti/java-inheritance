package com.in28minutes.oops.level2;

//getting error

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("id - %d , decsription - %d , rating - %d", id, description, rating);
	}
}
