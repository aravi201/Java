package com.arrays;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		
		int []  arr=new int[n];
		
		int evencount=0;
		int oddcount=0;
		System.out.println("enter the array elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
			if(arr[i]%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		
	}
		System.out.println("the even numbers count:"+evencount);
		System.out.println("the odd numbers count:"+oddcount);
	}

}
//Count Even and Odd Numbers