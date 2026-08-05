package com.Operators;

import java.util.Scanner;
public class Basiccalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st number :");
		int a=sc.nextInt();
		
		System.out.println("enetr the 2nd number:");
		int b=sc.nextInt();
		
		System.out.println("enter the operator(+ or-):");
		char c=sc.next().charAt(0);
		
		int result=(c=='+')?(a+b):(a-b);
		System.out.println("the value is:"+result);
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
