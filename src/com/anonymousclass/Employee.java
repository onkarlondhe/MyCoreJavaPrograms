package com.anonymousclass;

public class Employee {

	protected int id;
	protected String name;
	protected double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return "Employee Id = "+this.id+
				"\nEmployee Name = "+this.name+
				"\nEmployee Salary = "+this.salary;
	}
}
