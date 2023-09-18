//package com.queue;
//import java.util.*;
//
//public class Client {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Queue<Customer> cust = new LinkedList<Customer>();
//		
//		int choice;
//		String wish;
//		
//		do {
//			System.out.println("Press 1: add customer");
//			System.out.println("Press 2: serve customer");
//			System.out.println("Press 3: display all customer");
//			
//			Scanner sc = new Scanner(System.in);
//			choice = sc.nextInt();
//			
//			switch(choice) {
//			case 1:
//				System.out.println("enter id ");
//				int id=sc.nextInt();
//				
//				System.out.println("enter name");
//				String name = sc.next();
//				
//				System.out.println("enter purpose");
//				String purpose = sc.next();
//				
//				cust.add(new Customer(id,name,purpose));
//				break;
//				
//			case 2:
//				
//			}
//			
//		}while();
//	}
//
//}
