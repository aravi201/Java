package com.logicalstatements.loops;

import java.util.Scanner;

public class Sumeven {
	static void Sumofeven(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
			
		}
		System.out.println("sum of the even numbers:"+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the range:");
		int n=sc.nextInt();
		
		Sumofeven(n);
		
		// TODO Auto-generated method stub

	}

}
//Find the sum of all even numbers from 1 to 100.