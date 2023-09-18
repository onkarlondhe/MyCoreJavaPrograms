package com.xyz;

public class Twowheeler extends Vehicle {
	
	private String type;	
	public Twowheeler()
	{
		this.type="NA";
	}
	
	public Twowheeler(int id, String name, String type)
	{
		super(id,name);
		this.type=type;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("two wheeler started");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("two wheeler stopped");
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("two wheeler accelerated");
	}
	
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("two wheeler brakes");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n type-"+this.type;
	}
}
