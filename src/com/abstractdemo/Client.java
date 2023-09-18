package com.abstractdemo;

public class Client {

	public static void accountinterest(Account a) {
		a.calculateintrest();
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount(1000,2);
		accountinterest(sa);
		
		RecurringAccount ac=new RecurringAccount(2000,4);
		accountinterest(ac);
	}

}
