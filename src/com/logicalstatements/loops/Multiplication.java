package com.logicalstatements.loops;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the number:");
		
		int n=sc.nextInt();
		
		 for(int i=1;i<=10;i++) {
			 System.out.println(n*i);
		 }
		
		
		sc.close();
		

	}

}
//Write a Java program to print the multiplication table of a given number from 1 to 10.