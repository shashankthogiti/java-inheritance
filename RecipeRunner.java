package com.in28minutes.oops.level2.Abstract;

public class RecipeRunner {
	public static void main(String[] args) {

		/*
		 * Defination of Abstract : Abstarct class is a restricted class that cannot be
		 * used to create objects
		 */

		Recipe1 recipe = new Recipe1();
		recipe.execute();

		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}

}
