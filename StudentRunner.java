package com.in28minutes.oops.level2.inheritence;

public class StudentRunner {

	public static void main(String[] args) {
		// Student student = new Student();
		// student.setName("shashank");
		// student.setEmail("shashankthogiti@gmail.com");

		Person person = new Person();
		person.setName("shashank");
		person.setEmail("shashankthogiti@gmail.com");
		person.setPhoneNumber("123-456-7890");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	}

}
