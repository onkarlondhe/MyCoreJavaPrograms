package com.enumdemo;

public class Product {

	private int pId;
	private String pName;
	private double pPrice;
	private Category pCategory;
	
	public Product(int pId, String pName, double pPrice, Category pCategory) {
		this.pId=pId;
		this.pName=pName;
		this.pPrice=pPrice;
		this.pCategory=pCategory;
	}
	
	public Category getCategory() {
		return this.pCategory;
	}
	
	public String toString() {
		return "Product Id="+this.pId+
				"\nProduct Name="+this.pName+
				"\nProduct Price="+this.pPrice+
				"\nProduct Category="+this.pCategory;
	}
}
