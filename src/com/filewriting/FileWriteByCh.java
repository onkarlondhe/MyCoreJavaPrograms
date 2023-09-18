package com.filewriting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteByCh {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter paragraph : ");
		String paragraph = sc.nextLine();
		
		FileWriter fw = new FileWriter("MyFile.txt");
		
		for(int i=0; i<paragraph.length(); i++) {
			
			fw.write(paragraph.charAt(i));
		}
		
		System.out.println("File created successfully...");
		fw.close();
	}
	

}
