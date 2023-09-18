package com.exception;

public class Client {

	public static void main(String[] args) {
		try {
			Product p1 = new Product(1,"watch",2000);
			System.out.println(p1);
			Product p2 = new Product(2,"remote",200);
			System.out.println(p2);
			Product p3 = new Product(1,"bottle",40);
			System.out.println(p3);
		}
		catch(ProductException pe) {
			System.out.println(pe.getMessage());
		}
	}

}
