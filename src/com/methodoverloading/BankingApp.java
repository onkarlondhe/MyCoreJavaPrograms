package com.methodoverloading;

public class BankingApp {

	public static void calculateIntr(double intrate) {
		System.out.println("intrate is : "+intrate);
	}
	
	public static void calculateIntr(double intrate, String acctype) {
		System.out.println("intrate is : "+intrate + "\nAccount Type is : "+acctype);
	}
}
