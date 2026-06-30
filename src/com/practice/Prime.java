package com.practice;
import java.util.Scanner;
public class Prime {
	//prime or not
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		

		
		System.out.println(" enter a number");
		int n=sc.nextInt();
		
		
		if(n<=1) {
			System.out.println("not a prime");
		}
		else {
			int i;
			
			for(i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("not at all prime");
					break;
				}
				
			}
			if(i==n) {
				System.out.println("prime");
			}
		}
		sc.close();
	}

}
