package com.abstractdemo;

public class RecurringAccount extends Account{

	public RecurringAccount(double balance, double intrate) {
		super(balance, intrate);
		 
	}

	@Override
	public void calculateintrest() {
		// TODO Auto-generated method stub
		double interest=this.balance+this.intrate;
		System.out.println("Total Interest : "+interest);
	}
	
	public String toString() {
		return super.toString();
	}

}
