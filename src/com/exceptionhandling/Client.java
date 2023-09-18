package com.exceptionhandling;
import java.util.Scanner;

public class Client {

	public static int divide(int numerator, int denominator) throws ArithmeticException {
		try {
			int result = numerator/denominator;
			return result;
		}
		catch(ArithmeticException ae) {
			throw ae;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Numerator = ");
			int numerator = sc.nextInt();
			
			System.out.println("Enter Denominator = ");
			int denominator = sc.nextInt();
			int result = divide(numerator,denominator);
			System.out.println("Result = "+result);
			
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
	}
}