package com.xyz;

public class Client {
	
	
	public static void ride(Vehicle v)
	{
		System.out.println(v.toString());
		v.start();
		v.accelerate();
		v.brake();
		v.stop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Twowheeler activa=new Twowheeler(1,"activa","Non electric");
		ride(activa);
		
		Fourwheeler ford=new Fourwheeler(2,"ford","Non Electric");
		ride(ford);
		ford.print();

	}

}
