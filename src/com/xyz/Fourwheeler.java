package com.xyz;
 
public class Fourwheeler extends Vehicle implements IPrintable{
	
	
   private String type;
	
	public Fourwheeler()
	{
		this.type = "NA";
	}
	
	public Fourwheeler(int id, String name, String type)
	{
		super(id, name);
		this.type = type;
	}
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("fourwheeler started");
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("fourwheeler accelerated");
	}
	
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("fourwheeler breaked");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("fourwheeler stopped");
	}

	@Override
	public String toString() {
		return super.toString()+"\n type-"+this.type;
	}
	
	
	public void print()
	{
		System.out.println("the print method of Fourwheeler");
	}

}