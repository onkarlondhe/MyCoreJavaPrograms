package com.xyz;

public abstract class Vehicle {
	
	private int id;
	private String name;
	
	public Vehicle()
	{
		this.id=0;
		this.name="NA";
	}
	
	public Vehicle(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public abstract void start(); //funciton witout body is abstract
	
	
	public abstract void stop();
	
	
	public abstract void accelerate();
	
	
	public abstract void brake();
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id-"+this.id+
				"\n name-"+this.name;
	}
	

}
