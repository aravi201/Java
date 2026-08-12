package com.logicalstatements.loops;

import java.util.Scanner;

public class Reversedigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the number");
		int n=sc.nextInt();
		
		int reverse=0;
		int digit;
		for(;n>0;n/=10) {
			digit=n%10;
			reverse=reverse*10+digit;
		}
		System.out.println("the reverse number  is:"+reverse);
		
		sc.close();
	}

}
//Find the reverse of a number