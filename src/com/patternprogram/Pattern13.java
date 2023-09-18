package com.patternprogram;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of row : ");
		
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int sp=1; sp<i; sp++) {
				System.out.print(" ");
			}
			for(int st=i; st<=row; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=row-1; i>=1; i--) {
			for(int sp=1; sp<i; sp++) {
				System.out.print(" ");
			}
			for(int st=i; st<=row; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
