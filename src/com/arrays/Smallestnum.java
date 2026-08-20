package com.arrays;

import java.util.Scanner;

public class Smallestnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size of the array:");
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int small=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("the smallest number is:"+small);
		sc.close();
	}

}
//. Find the Smallest Element