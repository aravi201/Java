package com.logicalstatements.loops;

import java.util.Scanner;

public class Checkprime {
	
	public static boolean isprime(int n) {
		boolean boo=true;
		if(n==0||n==1)
			return false;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				boo=false;
				break;
			}
			
			
		}
		return boo;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the number");
		int n=sc.nextInt();
		
		if(isprime(n)) {
			System.out.println("it is  a prime");
		}else {
			System.out.println("it is not  a prime");
		}
		
		
		
		sc.close();
	}

}
