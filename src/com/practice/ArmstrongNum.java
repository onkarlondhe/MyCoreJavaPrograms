package com.practice;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num : ");
	int num = sc.nextInt();
	int sum = 0;
	int temp = num;
	
	while(num!=0) {
		int rem = num%10;
		sum = sum+(rem*rem*rem);
		num = num/10;
	}
	
	if(temp==sum) {
		System.out.println("the number is armstrong...");
	}else {
	System.out.println("the number is not armstrong...");
	}
	}
}
