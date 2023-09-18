package com.patternprogram;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of row : ");
		
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int sp=1 ;sp<i; sp++) {
				System.out.print(" ");
			}
			
			for(int st=1; st<=row; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
