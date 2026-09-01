package com.arrays;

import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of array:");
		int n=sc.nextInt();
		int[] arr =new int[n];
		
		System.out.println("enter the numbers:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int lar=arr[0];
		int slar=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lar) {
				slar=lar;
				lar=arr[i];
			}
			else if(slar<arr[i] && arr[i]<lar) {
				slar=arr[i];
			}
		}
		System.out.println("the largest number is:"+lar);
		System.out.println("the largest number is:"+slar);
		
		sc.close();
	}
	

}
//1. Find the Largest Element
//Input: [3, 5, 2, 9, 1]
//Output: 9