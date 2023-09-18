package com.multithreading;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static method execute first..");
		ParentTimeConsuming p = new ParentTimeConsuming();
		p.start();
		
		ChildTimeConsuming c = new ChildTimeConsuming();
		c.start();
		
		System.out.println("hello");
	}

}
