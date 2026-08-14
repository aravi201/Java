package com.logicalstatements.loops;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int digit;
		int sum=0;
		
		while(n>9) {
			
			while(n>0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		n=sum;
		sum=0;
		
		}
		if(n==1) {
		System.out.println("the given number is a magic number");
	}else {
		System.out.println("the given number is not a magic number");
	}
}
}