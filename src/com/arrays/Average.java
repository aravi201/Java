package com.arrays;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		int sum=0;
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			sum+=arr[i];
		}
		
		double avg=sum/n;
		System.out.println("the average of an array:"+avg);
	}

}
