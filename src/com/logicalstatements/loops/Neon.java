package com.logicalstatements.loops;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		
		int square=n*n;
		int sum=0;
		
		for(int temp=square;temp>0;temp/=10) {
			int digit=temp%10;
			sum+=digit;
			
		}
		if(sum==n) {
			System.out.println(n+"is a neon number");
		}else {
			System.out.println(n+"is not a neon number");
		}
		
		
		
		sc.close();

	}

}
//Java Task
//Question:
//1.Write a Java program to check whether a given number is a Neon Number.
//A Neon Number is a number where the sum of the digits of its square is equal to the original number.
//Sample Input 1
//Enter a number: 9
//Sample Output 1
//9 is a Neon Number.
//Explanation:
//9² = 81
//8 + 1 = 9
//Sample Input 2
//Enter a number: 10
//Sample Output 2
//10 is not a Neon Number.
//Explanation:
//10² = 100
//1 + 0 + 0 = 1 ≠ 10