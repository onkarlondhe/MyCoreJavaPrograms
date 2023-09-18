package com.inheritance;

public class Client {

	public static void displayDetails(Student s) {
		System.out.println(s);
		System.out.println("Total Aggregate : "+s.calculateAggregate());
		
		if((s.getClass().getName()).equals(MedicalStudent.class.getName())){
			MedicalStudent ms;
			ms = (MedicalStudent)s;
			ms.practice();
		}
		
		if((s.getClass().getName()).equals(EngineeringStudent.class.getName())) {
			EngineeringStudent es;
			es = (EngineeringStudent)s;
			es.project();
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 MedicalStudent ms = new MedicalStudent(1,"Onkar",85,48);
	 displayDetails(ms); 
	 
	 EngineeringStudent es = new EngineeringStudent(1,"Hritesh",83,49);
	 displayDetails(es);
	 
	}

}
