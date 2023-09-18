package com.defaultinterface;

public class Amazon implements PaymentOption{

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		System.out.println("Amazon Payment Paying thru NetBanking...");
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("Amazon Payment Paying thru Credit Card...");

	}

	
}
