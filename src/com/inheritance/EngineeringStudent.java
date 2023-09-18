package com.inheritance;

public class EngineeringStudent extends Student{

	private double projectMarks;
	
	public EngineeringStudent(int id, String name, double marks, double projectMarks) {
		super(id, name, marks);
		 this.projectMarks=projectMarks;
	}

	public String toString() {
		return super.toString()+
		"\nProjectMarks = "+this.projectMarks;
	}
	
	public double calculateAggregate() {
		return (this.marks+this.projectMarks);
	}
	
	public void project() {
		System.out.println("Engineering Student");
	}
 }
