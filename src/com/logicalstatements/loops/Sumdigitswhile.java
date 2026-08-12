package com.logicalstatements.loops;

import java.util.Scanner;

public class Sumdigitswhile {
	
	static void Sumofdigits(int n) {
		int sum=0;
		int digit;
		while(n>0) {
			
			digit=n%10;
			sum=digit+sum;
			n/=10;
		}
		System.out.println("the sum of digits is:"+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the digits:");
		int n=sc.nextInt();
		
		Sumofdigits(n);
		// TODO Auto-generated method stub
		sc.close();
	}

}
//sum of  digits of number