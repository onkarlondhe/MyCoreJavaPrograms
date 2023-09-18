package com.buffordemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufforDemo {

	public static void main(String[] args) throws IOException {

		InputStreamReader io = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(io);
		
		System.out.print("enter the name : ");
		String name = br.readLine();
		
		System.out.println("enter the address");
		String address = br.readLine();
		
		System.out.print("enter the mobileNum : ");
		int mobileNum = Integer.parseInt(br.readLine());
		
		
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(mobileNum);

	}

}
