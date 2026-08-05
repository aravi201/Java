package com.logicalstatements.loops;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
		
		int count=0;
		for(;n>0;n/=10) {
			count++;
		}
		System.out.println("the digit count is:"+count);
		sc.close();
	}

}
//Today Task
//Java 
//1.Count the digits in a number.
//Input
//Enter a number: 12345
//Output
//Number of Digits: 5
