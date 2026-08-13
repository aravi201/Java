package com.logicalstatements.loops;

import java.util.Scanner;

public class Perfect {
	static boolean isperfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}if(sum==n) {
			return true;
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
		    if (isperfect(i)) {
		        System.out.println(i);
		    }
		}
	}
	}

//1.write a java program to print the perfect number between the range 1 to 100.