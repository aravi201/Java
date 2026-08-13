package com.logicalstatements.loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		for(int num=2;num<=n;num++) {
			boolean boo=true;
			for(int j=2;j<=num/2;j++) {
				if(num%j==0) {
					boo=false;
					break;
				}
			}
			if(boo) {
				System.out.print(num+" ");
			}
			
		}

	}

}






