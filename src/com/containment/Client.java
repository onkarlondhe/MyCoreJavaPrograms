package com.containment;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] p = new Product[3];
		p[0] = new Product(1, "Mobile", 20000, new Address("Pune", "413410"));
		p[1] = new Product(2, "SmartWatch", 4000, new Address("Solapur", "410001"));
		p[2] = new Product(3, "TV", 60000, new Address("Mumbai", "401123"));

		for(Product parr : p) {
			System.out.println(parr);
		}
 	}

}
