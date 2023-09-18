package com.stack;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private int price;
	
	public Book(int id, String name, String author, int price) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public String toSting() {
		return "book Id="+this.id+"\nBook Name="+this.name+"\nBook Author="+this.author+"\nBook Price="+this.price;
	}
}
