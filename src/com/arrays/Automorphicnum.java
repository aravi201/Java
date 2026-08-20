package com.arrays;

import java.util.Scanner;

public class Automorphicnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int n=sc.nextInt();
		
		int Square=n*n;
		int temp=n;
		
		while(temp>0) {
			if(n%10 != Square%10) {
				System.out.println("the given number is not a automorphic number");
				
			}
			temp/=10;
			Square/=10;
		}
		System.out.println("the given number is  a automorphic number");
	}

}