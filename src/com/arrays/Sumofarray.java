package com.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Sumofarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the 1st array:");
		int n=sc.nextInt();
		System.out.println("enter the size of the 2nd array:");
		int m=sc.nextInt();
		
		int[] arr1=new int[n];
		
		int[] arr2=new int[m];
		
		
		int[] arr3 = new int[n + m];
        int[] arr4 = new int[Math.max(n, m)];
		
		
		System.out.println("enter the 1st array elements:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			
		}
		System.out.println("enter the 2nd array elements:");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[n+i]=arr2[i];
		}
		System.out.println("merged array:");
		System.out.println(Arrays.toString(arr3));
		
		
		for(int i=0;i<arr1.length;i++) {
			arr4[i]=arr1[i]+arr2[i];
		}
		System.out.println("sum of 2 arrays:");
		System.out.println(Arrays.toString(arr4));
		
	}

}
