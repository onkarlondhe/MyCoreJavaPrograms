package com.anonymousclass;

public class Client {

	public static void displayFilterEmployee(Employee[] err,FilterEmployee f) {
		for(Employee e : err) {
			if(f.filter(e)) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] err = new Employee[5];
		err[0] = new Employee(1,"Hritesh",60000);
		err[1] = new Employee(2,"Onkar",50000);
		err[2] = new Employee(3,"Anup",45000);
		err[3] = new Employee(4,"Yashodhan",64000);
		err[4] = new Employee(5,"Abhishek",100000);
		
 			
	 }	 
}
	


