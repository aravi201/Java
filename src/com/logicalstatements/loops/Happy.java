package com.logicalstatements.loops;

import java.util.Scanner;

public class Happy {
	static boolean Happynumber(int n) {
		boolean happy=true;
		int r;
		while(n>9) {
			int sum=0;
			while(n>0) {
				r=n%10;// 19->9->1
				sum=sum+Math.powExact(r, 2);
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
		if(happy) {
			System.out.println("the given number is a happy number");
		}else {
			System.out.println("the given number  is not a happy number");
		}

	}

}
//Input - 19 =>1² + 9² = 82
//8² + 2² = 68
//6² + 8² = 100
//1² + 0² + 0² = 1
//Output - Happy Number