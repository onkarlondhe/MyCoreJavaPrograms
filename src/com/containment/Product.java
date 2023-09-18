package com.containment;

public class Product {

	private int pid;
	private String pname;
	private int price;
	private Address mfgAddress;
	
	public Product(int pid,String pname,int price,Address mfgAddress) {
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		this.mfgAddress=mfgAddress;
	}
	
	public String toString() {
		return "pId = "+this.pid+
				"\npName = "+this.pname+
				"\nPrice = "+this.price+
				"\n"+this.mfgAddress;
	}
}
