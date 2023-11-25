package com.in28minutes.oops.level2.inheritence2;

import java.math.BigDecimal;

//import com.in28minutes.oops.level2.inheritence1.Person;

public class Employee extends Person {

	private String title;
	private String employeeName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		// super();
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public char getEmployeeGrrade() {
		return employeeGrade;
	}

	public void setEmployeeGrrade(char employeeGrrade) {
		this.employeeGrade = employeeGrrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employeeName + "#" + employeeGrade;
	}
}