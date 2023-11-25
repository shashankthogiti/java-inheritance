package com.in28minutes.oops.level2.inheritence2;

//import com.in28minutes.oops.level2.inheritence1.Employee;
//getting error

public class StudentRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("shashank", "Programmer Analyst");
		//employee.setName("shashank");
		employee.setEmail("shashankthogiti@gmail.com");
		employee.setEmployeeGrrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);
	}


}


