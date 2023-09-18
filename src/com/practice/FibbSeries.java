package com.practice;

import java.util.Scanner;

public class FibbSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num = ");
		int num = sc.nextInt();
		
		int n1 = 0;
		System.out.println(n1);
		int n2 = 1;
		System.out.println(n2);
		
		
		int nt=0;
 		for(int i=1; i<=num-2; i++) {
			nt = n1+n2;
			System.out.println(nt);
			n1=n2;
			n2=nt;
		}
		
		 
	}

}
