package com.Operators;

import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eneter the a value");
		int a=sc.nextInt();
		
		System.out.println("eneter the b value");
		int b=sc.nextInt();
		
		System.out.println("before Swapping");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("--------------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		// TODO Auto-generated method stub

	}

}
//1.Write a Java program to swap two numbers without using a third variable.
//Input:
//A = 10
//B = 20
//
//Output:
//Before Swapping:
//A = 10
//B = 20
//
//After Swapping:
//A = 20
//B = 10