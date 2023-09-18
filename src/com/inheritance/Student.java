package com.inheritance;

public class Student {

	private int id;
	private String name;
	protected double marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "Id = "+this.id+
				"\nName = "+this.name+
				"\nMarks = "+this.marks;
	}
	
	public double calculateAggregate() {
		return (this.marks);
	}
}
