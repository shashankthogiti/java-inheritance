package com.in28minutes.oops.level2;

public class Fan {

	// state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed; // speed is in between 0 to 5

	// creations
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// isOn method

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0); // here we use type casting with byte because the default value will be an int
							// [here 0 is a default speed]
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state of the fan
	@Override
	public String toString() {			//toString method
		return String.format("make - %s , radius - %f , color - %s , isOn - %b , speed - %d ", make, radius, color,
				isOn, speed);
	}
}
