package com.logicalstatements.loops;

import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	largestnumber(n);
	
	sc.close();
	}
	static void largestnumber(int n) {
		int large=0;
		int digit;
		
		while(n>0) {
			digit=n%10;{
				if(digit>large) {
					large=digit;
					
				}
				n=n/10;
			}
		}System.out.println("the largest number is:"+large);
	}

}
//.Find the Largest Digit in a Number
//Input : 983742
//Output : Largest Digit = 9