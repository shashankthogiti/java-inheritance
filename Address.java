package com.in28minutes.oops.level2;

//we had done object inside a object i.e., Customer and Address both are objects

public class Address {
	private String line1;
	private String city;
	private String zip; // pincode

	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("city - %s , line1 - %s , zip - %s", city, line1, zip);

	}
	

}
