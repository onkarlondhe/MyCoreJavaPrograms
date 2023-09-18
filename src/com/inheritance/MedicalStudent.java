package com.inheritance;

public class MedicalStudent extends Student{

	private double internshipMarks;
	public MedicalStudent(int id, String name, double marks, double internshipMarks) {
		super(id, name, marks);
		this.internshipMarks=internshipMarks;
	}
	
	public String toString() {
		return super.toString()+
				"\nInternship Marks = "+this.internshipMarks;
	}
	
	public double calculateAggregate() {
		return (this.marks+this.internshipMarks);
	}
	
	public void practice() {
		System.out.println("Medical Student");
	}

}
