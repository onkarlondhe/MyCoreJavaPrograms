package com.filedemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteWriting {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anything : ");
		String str=sc.nextLine();
		
		FileOutputStream fos1=new FileOutputStream("data1.txt");
		FileOutputStream fos2=new FileOutputStream("data2.txt");
		FileOutputStream fos3=new FileOutputStream("data3.txt");
		FileOutputStream fos4=new FileOutputStream("data4.txt");
		
		byte b[]=str.getBytes();
		
		fos1.write(b);
		fos1.close();
		
		fos2.write(b);
		fos2.close();
		
		fos3.write(b);
		fos3.close();
		
		fos4.write(b);
		fos4.close();
		
		System.out.println("files created successfully...");

	}
}
