package com.exception;

 
public class Product {

	private int pid;
	private String pname;
	private int price;
 	
	public Product(int pid,String pname,int price) throws ProductException {
		this.pid=pid;
		this.pname=pname;
		
		if(price<=1000) {
			throw (new ProductException("Price is must be less than 100"));
		}
		this.price=price;
 	}
	
	public String toString() {
		return "pId = "+this.pid+
				"\npName = "+this.pname+
				"\nPrice = "+this.price;
 	}
}
