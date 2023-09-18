package com.containment;

public class Address {

	private String city;
	private String pincode;
	
	public Address(String city,String pincode) {
		this.city=city;
		this.pincode=pincode;
	}
	
	public String toString() {
		return "City = "+this.city+
				"\nPincode = "+this.pincode;
	}
}
