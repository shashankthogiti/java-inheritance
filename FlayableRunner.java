package com.in28minutes.oops.level2.inheritence.abstractexcercise;

interface Flayable {
	void fly();
}

class Bird implements Flayable
{

	@Override
	public void fly() {
		System.out.println("with Wings");
	}

}

class Aeroplane implements Flayable
{

	@Override
	public void fly() {
		System.out.println("with Fuel");
	}

}

public class FlayableRunner {
	public static void main(String[] args) {
		Flayable[] flyingObjects = { new Bird(), new Aeroplane() };// toloop it we use array in it
		for (Flayable object : flyingObjects) {
			object.fly();
		}

	}

}
