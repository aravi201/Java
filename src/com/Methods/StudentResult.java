package com.Methods;

import java.util.Scanner;
public class StudentResult {
	//without return type with args
	void displayStudent(String name) {
		System.out.println("student name is:"+name);
	}
	void calculateTotal(int m1, int m2, int m3) {
		int total=m1+m2+m3;
		System.out.println("the total marks:"+total);
	}
	void calculateAverage(int m1, int m2, int m3) {
		float average=m1+m2+m3/3;
		System.out.println("the average value is:"+average);
	}
	
	

	void main(String[] args) {
		
		System.out.println("main method strted");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name of the candidate:");
		String name=sc.nextLine();
		displayStudent(name);
		
		System.out.println("enter the 3 subject marks");
		int  m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		calculateTotal(m1,m2,m3);
		calculateAverage(m1,m2,m3);
		sc.close();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
//		1.Create a class named StudentResult.
//		2.Create the following methods:
//		displayStudent(String name)
//		calculateTotal(int m1, int m2, int m3)
//		calculateAverage(int m1, int m2, int m3)
//		3.Take input from scanner class And display details

	}

}
