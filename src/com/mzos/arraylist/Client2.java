package com.mzos.arraylist;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.mzos.Employee;

public class Client2 {

	public static void main(String[] args) {

	List<Employee> emplist = new Vector<>();
		
		int choice;
		String wish;
		Scanner sc = new Scanner(System.in);
		
			do {
				System.out.println("select option");
				System.out.println("1.Add Employee \n 2.Show All Employee \n 3.Remove Employee");
				choice = sc.nextInt();
			switch(choice) {
				case 1: {
				
					System.out.println("enter the emp details");
					int id = sc.nextInt();
					String name = sc.next();
					double salary = sc.nextDouble();
				
					emplist.add(new Employee(id, name, salary));
				
					break;
				}
				
				case 2:{
				
					System.out.println("show the emp details");
				
					for(Employee e : emplist) {
						System.out.println(e);
					}
					break;
				}
				
				case 3:{
					
					emplist.removeIf(s->s.getSalary()>60000);
					
					break;
				}
				default: 
					System.out.println("Invalid Credential");
				}
			
				System.out.println("perform any operations");
				wish= sc.next();
			}
		while(wish.equals("yes"));
	}

}
