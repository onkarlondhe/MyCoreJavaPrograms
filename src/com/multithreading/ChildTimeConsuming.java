package com.multithreading;

public class ChildTimeConsuming extends Thread{
	
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Child class running independently..."+Thread.currentThread().getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
