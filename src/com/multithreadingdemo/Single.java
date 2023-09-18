package com.multithreadingdemo;

public class Single implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Single s = new Single();
		Thread t = new Thread(s);
		t.start();
	}

	

}
