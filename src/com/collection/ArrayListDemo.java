package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("Ram");
		name.add("Sham");
		name.add("Raj");
		name.add("Rajesh");
		name.add("Raj");
		System.out.println(name+"\n");
		
		System.out.println(name.remove(3)+"\n");
		
		System.out.println(name+"\n");
		
		Iterator<String> it = name.iterator();
		
		for(String s : name) {
			System.out.println(s);
		}
		
		System.out.println();
		
		while(it.hasNext()) {
			String n = it.next();
			System.out.println(n);
		}

		 
		 
		
		
	}

}
