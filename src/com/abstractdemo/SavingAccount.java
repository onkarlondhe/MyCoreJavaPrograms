package com.abstractdemo;

public class SavingAccount extends Account{
	 
	public SavingAccount(double balance, double intrate ) {
		super(balance,intrate);
	}
	
	@Override
	public void calculateintrest() {
		// TODO Auto-generated method stub
		double interest=this.balance+this.intrate;
		System.out.println("Total Interest :"+interest);
	}

	public String toString() {
		return super.toString();		
	}


}
