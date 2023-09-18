package com.defaultinterface;

public class Zomato implements PaymentOption{

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		System.out.println("Zomato Payment Paying thru NetBanking...");

	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("Zomato Payment Paying thru Credit Card...");

	}

}
