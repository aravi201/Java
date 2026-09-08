package com.oops.polymorphism;

import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the choice");
		System.out.println("1.EngineerStudent,2.Medical,3.Management");
		int n=sc.nextInt();
		System.out.println("enter the marks:");
		int marks=sc.nextInt();
		switch(n) {
		case 1->{
			Student s=new EngineerStudent();
			s.calculateGrade(marks);
		}
		case 2->{
			Student s=new Medical();
			s.calculateGrade(marks);
			
		}
		case 3->{
			Student s=new Management();
			s.calculateGrade(marks);
		}
		default ->{
			System.out.println("Invalid choice");
		}
		}

	}

}
