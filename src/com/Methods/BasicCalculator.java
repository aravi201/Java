package com.Methods;

import java.util.Scanner;

public class BasicCalculator {
	void add(int a,int b) {
		System.out.println("addition :"+(a+b));
	}
	void subtract(int a,int b) {
		System.out.println("difference:"+(a-b));
	}
	void multiply(int a,int b) {
		System.out.println("multiplication:"+(a*b));
	}
	void divide(int a,int b) {
		if(b!=0) {
			System.out.println("division:"+((double)a/b));
		}
		else {
			System.out.println("error");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number 1");
    int n = sc.nextInt();
    System.out.println("Enter a number 2");
    int m = sc.nextInt();
    
    BasicCalculator calc = new BasicCalculator();

    // Call all methods
    calc.add(n,m);
    calc.subtract(n,m);
    calc.multiply(n,m);
    calc.divide(n,m);
	sc.close();
		
		// TODO Auto-generated method stub

	}

}
//Create a Java program that performs basic calculator operations using methods.
//Requirements:
//1.Read two numbers using Scanner.
//2.Create the following methods:
//add(a, b)
//subtract(a, b)
//multiply( a, b)
//divide(a, b)
//3.Call all four methods from the main() method.
//Each method should print its results