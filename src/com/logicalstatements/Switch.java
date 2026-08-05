package com.logicalstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select ticket type:");
		System.out.println("1. Silver - Rs.200");
		System.out.println("2.Gold - Rs.300");
		System.out.println("3. Platinum - Rs.500");
		System.out.println("4. Exit");
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
            double price=0.0;
		
		switch (choice) {
		case 1:
			 price =200;
			 System.out.println("enter your age:");
			 int age1=sc.nextInt();
			if(age1>=60) {
				 price=price-(price*10/100);
			 }
			System.out.println("the  silver ticket price is:"+price);
			break;
		case 2:
			price=300;
			System.out.println("enter your age:");
			 int age2=sc.nextInt();
			if(age2>=60) {
				 price=price-(price*10/100);
			 }
			System.out.println("the gold price is :"+price);
			break;
		case 3:
			price=500;
			System.out.println("enter your age:");
			 int age3=sc.nextInt();
			if(age3>=60) {
				 price=price-(price*10/100);
			 }
			System.out.println("the platinum price is:"+price);
			break;
		case 4:
			System.out.println("thank you visit again!!");
		 default:
			System.out.println("entered the invalid option");
			
			
			
		}
		}

		
}



//Java Assignment
//Question:
//1.A movie theater offers three types of tickets:
//1 → Silver (₹200)
//2 → Gold (₹300)
//3 → Platinum (₹500)
//•Write a Java program that:
//•Accepts the ticket type and customer's age as input.
//•Uses a switch statement to determine the ticket type and price.
//•Uses an if statement inside each case to check whether the customer is a senior citizen (age ≥ 60).
//•If the customer is a senior citizen, apply a 10% discount on the ticket price.
//•Display the ticket type and the final ticket price.
//Output
//Select Ticket Type:
//1. Silver - Rs.200
//2. Gold - Rs.300
//3. Platinum - Rs.500
//4. Exit
//Enter your choice: 2
//Enter your age: 65
//Gold Ticket Price: Rs.270.0
//
//Select Ticket Type:
//1. Silver - Rs.200
//2. Gold - Rs.300
//3. Platinum - Rs.500
//4. Exit
//Enter your choice: 4
//Thank you! Visit Again.