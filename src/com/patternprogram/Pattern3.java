package com.patternprogram;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int st=row; st>=i; st--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
