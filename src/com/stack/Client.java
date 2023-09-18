package com.stack;
import java.util.Stack;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Book> book = new Stack<>();
		int choice;
		String wish;
		
		do {
			
			System.out.println("Press 1: push a book");
			System.out.println("Press 2: Display all books");
			System.out.println("Press 3: pop a book");
			
			System.out.println("enter the choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter book Id = ");
				int id = sc.nextInt();
				System.out.println("enter book name = ");
				String name = sc.next();
				System.out.println("enter book author name = ");
				String author = sc.next();
				System.out.println("enter book price = ");
				int price = sc.nextInt();
				
				book.push(new Book(id,name,author,price));
				
				break;
				
			case 2 : 
				for(Book b:book) {
					System.out.println(b);
				}
				break;
				
		    case 3 :
		      Book b =book.pop();
		      System.out.println("popped book is = "+b);
		      System.out.println("remaining count of book is");
		       
		  	for(Book b1:book) {
				System.out.println(b1);
			}
		  	
		    default:
				System.out.println("Invalid Choice");	
			}
				
			System.out.println("do you want to perform more operations");
			wish=sc.next();
		}
		while(wish.toLowerCase().equals("yes"));
	 }
	}


