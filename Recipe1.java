package com.in28minutes.oops.level2.Abstract;

public class Recipe1 extends AbstractRecipe {

	/*
	 * Defination of Abstract : Abstarct class is a restricted class that cannot be
	 * used to create objects
	 */

	@Override
	void getReady() {
		System.out.println("Get the row matched");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("cleanup the utensils");
	}

}
