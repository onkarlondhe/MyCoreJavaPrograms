package com.arraylist;
import com.enumdemo.Category;
import com.enumdemo.Product;

import java.util.ArrayList;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> p = new ArrayList<Product>();
		
		int choice;
		String wish;
		
		do{
			System.out.println("Press 1: add product in cart");
			System.out.println("press 2: display all products");
			
			System.out.print("enter the choice : ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("enter the product Id : ");
			int pId = sc.nextInt();
			System.out.print("enter the product Name : ");
			String pName = sc.next();
			System.out.print("enter the product price : ");
			double pPrice = sc.nextDouble();
			System.out.print("enter the product price : ");
 			p.add(new Product(pId,pName,pPrice,Category.pCategory));
			break;
		
		
		case 2 :
			for(Product pro:p) {
				System.out.println(pro);
		}
		break;
		
		case 3 :
			for(Product pro:p) {
				if(pro.getCategory()==Category.COSMETICS) {
					System.out.println(pro);
				}
			}
		default:
			System.out.println("Invalid Choice");
		}
		
		System.out.println("do you want to perform more operations");
		wish=sc.next();
		}while(wish.toLowerCase().equals("yes"));
	}

}
