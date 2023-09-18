package com.patternprogram;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num of rows : ");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int sp=i; sp<=row; sp++) {
				System.out.print(" ");
			}
			for(int st=1; st<=i; st++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
