package com.Methods;


import java.util.Scanner;

public class LoanIntrest {
	static Scanner sc=new Scanner(System.in);
	double calculateInterest(double principal, double rate, int time) {
		double si=(principal*rate*time)/100;
		return si;
	}
	
	

	public static void main(String[] args) {
		
		LoanIntrest t=new LoanIntrest();
		System.out.println("enter the pricipal amount:");
		double pr=sc.nextDouble();
		System.out.println("enter the rate odf intrest");
		double rr=sc.nextDouble();
		System.out.println("enter the time:");
		int ti=sc.nextInt();
		
		System.out.println("value of simple interst:"+t.calculateInterest(pr,rr,ti));
		
		
		
		
//		Today Task
//		Java
//		1.Loan Interest
//		Scenario: A bank wants to calculate the simple interest for a customer.
//		2.Create a method calculateInterest(double principal, double rate, int time) that returns the simple interest.
//		3.Read the principal amount, rate of interest, and time using Scanner.
//		4.Call the method and display the simple interest.
//		5.Formula Used:
//		Simple Interest = (Principal × Rate × Time) / 100

	}

}
