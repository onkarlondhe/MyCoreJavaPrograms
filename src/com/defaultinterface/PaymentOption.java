package com.defaultinterface;

public interface PaymentOption {

	void netbanking();
	void creditcard();
	
	default void gPay() {
		System.out.println("Payment Paying thru GPay...");
	}
}
