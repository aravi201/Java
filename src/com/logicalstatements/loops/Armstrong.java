package com.logicalstatements.loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		int result=0;
		int digits = String.valueOf(n).length();
		while(n>0) {
			r=n%10;
			result=result+(int) Math.pow(r, digits);
			n=n/10;
		}
		if(result==temp) {
			System.out.println("the given number is armstrong number");
		}
		else {
			System.out.println("the given number is not armstrong number");
		}
		
		sc.close();
	}

}
// armstrong number ex:153:1^3+5^3+3^3=153