package com.arraylist;

 
public class Product {

	private int pId;
	private String pName;
	private double pPrice;
 	
	public Product(int pId, String pName, double pPrice) {
		this.pId=pId;
		this.pName=pName;
		this.pPrice=pPrice;
 	}
	
	public String toString() {
		return "Product Id="+this.pId+
				"\nProduct Name="+this.pName+
				"\nProduct Price="+this.pPrice;
				 
	}
}
