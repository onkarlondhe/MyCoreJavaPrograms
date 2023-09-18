package com.enumdemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] prr = new Product[6];
		
		prr[0]=new Product(1,"Smart Tv",35000,Category.ELECTRONICS);
		prr[1]=new Product(2,"Table",2000,Category.FURNITURE);
		prr[2]=new Product(3,"FaceWash",350,Category.COSMETICS);
		prr[3]=new Product(4,"Smart Watch",5000,Category.ELECTRONICS);
		prr[4]=new Product(5,"Bed",22000,Category.FURNITURE);
		prr[5]=new Product(6,"Perfume",350,Category.COSMETICS);

		for(Product p:prr) {
			if(p.getCategory()==Category.COSMETICS) {
 				System.out.println(p);
			}	
		}
		
		for(Product p:prr) {
			if(p.getCategory()==Category.ELECTRONICS) {
				System.out.println(p);
			}
		}

		for(Product p:prr) {
			if(p.getCategory()==Category.FURNITURE) {
				System.out.println(p);
			}
		}

		
	}

}
