package com.logicalstatements.loops;

import java.util.Scanner;

public class Nprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the how many primes");
		int n=sc.nextInt();
		
		int count=0;
		int num=2;
		
		while(count<n) {
			boolean boo=true;
			
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					boo =false;
					break;
				}
			}if(boo) {
					System.out.print(num+ " ");
					count++;
			}
			num++;
		}
		
	}

}
