package com.multithreading;

public class ParentTimeConsuming extends Thread{

	public void run() {
		
		
		try {
			Thread.sleep(6000);
			System.out.println("parent class running independently.."+Thread.currentThread().getId());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
