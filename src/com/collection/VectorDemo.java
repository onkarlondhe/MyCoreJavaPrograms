package com.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Object> name = new Vector<Object>();
		
		name.add(1);
		name.add(0.25);
		name.add('A');
		name.add("String");
		System.out.println(name);
		
	}

}
