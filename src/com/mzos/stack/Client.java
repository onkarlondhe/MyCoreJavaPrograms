package com.mzos.stack;

import java.util.Scanner;
import java.util.Stack;

public class Client {

	public static void main(String[] args) {

		Stack<Card> card = new Stack<>();
		int choice;
		String wish;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.enter the Card Details \n 2.show the Card Details \n 3.remove the card");
			choice = sc.nextInt();

		switch(choice) {
		
		case 1:{
			
			System.out.println("enter the card details");
			int cardId = sc.nextInt();
			String cardName = sc.next();
			card.push(new Card(cardId, cardName));
			break;
		}
		
		case 2:{
			for(Card c :card) {
				System.out.println(c);
			}
			break;
		}
		
 		case 3:{
			Card popCard = card.pop();
			System.out.println("remove card is "+popCard);
			break;
		}
 		default:{System.out.println("invalid credential..");}
		}
 		System.out.println("do you want to perform more operation..");
 		wish = sc.next();
		}while(wish.equals("yes"));
	
	}
}
