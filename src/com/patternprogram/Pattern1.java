package com.patternprogram;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num of row : ");
	int row=sc.nextInt();
	
	for(int i=0; i<=row; i++) {
		for(int st=1; st<=i; st++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	
	}

}
