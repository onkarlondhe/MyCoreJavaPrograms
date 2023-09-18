package com.mzos;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		 
		ArrayList<Employee> emplist = new ArrayList<>();
		
		int choice;
		String wish;
		Scanner sc = new Scanner(System.in);
		
			do {
				System.out.println("select option");
				System.out.println("1.Add Employee \n 2.Show All Employee");
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
				default: 
					System.out.println("Invalid Credential");
				}
			
				System.out.println("perform any operations");
				wish= sc.next();
			}
		while(wish.equals("yes"));
	}

}
