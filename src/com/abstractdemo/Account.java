package com.abstractdemo;

public abstract class Account {

	protected double balance;
	protected double intrate;
	
	public Account(double balance, double intrate) {
		this.balance=balance;
		this.intrate=intrate;
	}
	
	public abstract void calculateintrest();
 	
	public String toString() {
		return "Balance : "+this.balance+
				"\ninterate : "+this.intrate;
				
	}
}
