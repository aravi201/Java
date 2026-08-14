package com.logicalstatements.loops;

import java.util.Scanner;

public class Happy {
	static boolean Happynumber(int n) {
		boolean happy=true;
		int digit;
		while(n>=10) {
			int sum=0;
			while(n>0) {
				digit=n%10;// 19->9->1
				sum=sum+Math.powExact(digit, 2);
				n=n/10;
			}
			n=sum;
		}
		
		
		
		return happy;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		boolean happy=Happynumber(n);
		if(happy||n==1) {
			System.out.println("the given number is a happy number");
		}else {
			System.out.println("the given number  is not a happy number");
		}

	}

}
