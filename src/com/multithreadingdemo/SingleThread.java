package com.multithreadingdemo;

public class SingleThread extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	
	
	public static void main(String[] args) {

		SingleThread st = new SingleThread();
		st.start();
	}

}
