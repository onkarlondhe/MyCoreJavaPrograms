package com.multithreadingdemo;

public class ThreadSchedulerDemo extends Thread{

	@Override
	public void run() {

		String n = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++) {
			System.out.println(n);
		}
	}
	
	
	public static void main(String[] args) {

		
		ThreadSchedulerDemo td1 = new ThreadSchedulerDemo();
		ThreadSchedulerDemo td2 = new ThreadSchedulerDemo();
		ThreadSchedulerDemo td3 = new ThreadSchedulerDemo();
		
		td1.setName("thread1");
		td2.setName("Thread2");
		td3.setName("thread3");
		td1.start();
		td2.start();
		td3.start();
	}

}
