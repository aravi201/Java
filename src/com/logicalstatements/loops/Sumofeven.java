package com.logicalstatements.loops;

import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println("the sum of n numbers:"+sum);
		sc.close();
	}


}
//Find the sum of even numbers from 1 to N.