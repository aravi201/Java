package com.logicalstatements.loops;

import java.util.Scanner;

public class sum_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("eneter the number");
		int n=sc.nextInt();
		
		int sum=0;
		int digit;
		for(;n>0;n/=10) {
			digit=n%10;
			sum=digit+sum;
		}
		System.out.println("the digit count is:"+sum);
	
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
//2.Find the sum of digits of a number.
//
//Input
//Enter a number: 1234
//Output
//Sum of Digits: 10
