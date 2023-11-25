package com.in28minutes.oops.level2.Abstract;

public abstract class AbstractRecipe {
	// prepare - getting all the things which I needed
	// recipe - preparing a recipe
	// cleanup -removing unwanted wastage

	/*
	 * Defination of Abstract : Abstarct class is a restricted class that cannot be
	 * used to create objects
	 */

	public void execute() {
		getReady(); // insted of prepare we wrote Ready
		doTheDish(); // insted of recipe we wrote TheDish
		cleanup();
	}

	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
}
