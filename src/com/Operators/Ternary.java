package com.Operators;
import java.util.Scanner;

public class Ternary {
	
	void number(int a) {
		String result=(a>0)?"positive":"neagtive";
		System.out.println("the number is:"+result);
	}
	void grade(int marks) {
		String grade=(marks >= 90)? "A":
				(marks >= 75 )? "B":
				(marks >= 60)? "C":
				(marks >= 40 )? "D": "Fail";
		System.out.println("grade:"+grade);
	}

    

    

    public static void main(String[] args) {
        System.out.println("main method started");
        
        Ternary t=new Ternary();
        Scanner sc=new Scanner(System.in);
        
         System.out.println("enter the number:");
         int a=sc.nextInt();
         t.number(a);
         
         System.out.println("enter the marks");
         int marks=sc.nextInt();
         t.grade(marks);
        
        
        sc.close();
    }
}
//Java
//1.Check whether a number is positive or negative using the ternary operator.
//2.Assign a grade based on marks using nested ternary operators.
//Marks >= 90 → A
//Marks >= 75 → B
//Marks >= 60 → C
//Marks >= 40 → D
//Otherwise → Fail