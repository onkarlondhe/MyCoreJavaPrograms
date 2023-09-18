package com.interfacedemoo;

public class Test implements Notification{

	@Override
	public void sendemail() {
		// TODO Auto-generated method stub
		System.out.println("Sending massage by Mail...");
	}

	@Override
	public void sendsms() {
		// TODO Auto-generated method stub
		System.out.println("Sending massage by SMS...");

	}

	@Override
	public void sendAppNotification() {
		// TODO Auto-generated method stub
		System.out.println("Sending massage By App...");

	}

	
}
