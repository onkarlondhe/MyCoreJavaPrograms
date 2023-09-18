package com.queue;

public class Customer {

	private int id;
	private String name;
	private String purpose;
	
	public Customer(int id, String name, String purpose) {
		
		this.id=id;
		this.name=name;
		this.purpose=purpose;
		
	}
	
	public String toString() {
		return "Id = "+this.id+"\nName = "+this.name+"\nPurpose = "+this.purpose;
	}
}
