package com.defaultinterface;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a = new Amazon();
		a.creditcard();
		a.netbanking();
		a.gPay();
		
		Zomato z = new Zomato();
		z.creditcard();
		z.netbanking();
		z.gPay();
	}	
}
