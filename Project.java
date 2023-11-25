package com.in28minutes.oops.level2.inheritences.ComplexAlgoritham;

public class Project {
	public static void main(String[] args) {
		ComplexAlgoritham algoritham = new DummyAlgoritham();
		System.out.println(algoritham.complexAlgoritham(10, 20));

		System.out.println();

		ComplexAlgoritham algoritham1 = new RealAlgoritham();
		System.out.println(algoritham1.complexAlgoritham(10, 20));
	}
}
