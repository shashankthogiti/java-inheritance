package com.in28minutes.oops.level2.inheritences.GamingConsole.method2;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Goes in to hole");
	}

	@Override
	public void left() {
		System.out.println("Go Forward");
	}

	@Override
	public void right() {
		System.out.println("Go Backward");

	}

}
