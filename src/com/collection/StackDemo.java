package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> name = new Stack<>();
		name.push("Ram");
		name.push("Sham");
		name.push("Raj");
		name.push("Rajesh");
		
		System.out.println(name);
		
		System.out.println(name.pop());
		
		System.out.println(name.peek());
		
		System.out.println(name);
		
		System.out.println(name.isEmpty());


	}

}
