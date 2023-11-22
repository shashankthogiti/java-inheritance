package com.in28minutes.oops.level2.inheritence;

public class Student extends Person {
// by extends command we get all the methods inPerson class to Student class also we can additionaly add methods in Student class
// here Person is called the super class and Student is called Sub class
	private String collegeName;
	private int year;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}





}
