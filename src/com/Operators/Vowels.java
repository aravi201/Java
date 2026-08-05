package com.Operators;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char a;
		
		System.out.println("enter the alphabet:");
		a=sc.next().charAt(0);
		
		String s=(a == 'a' || a== 'A' ||a== 'e' ||a=='E' || a=='i' || a=='I'|| a=='o'|| a=='O' || a=='U' || a=='u')?"Vowel": "Consonant";
		System.out.println(s);
		sc.close();
	}

}
//Java 
//Java Assignment
//1.Write a Java program to check whether a given character is a vowel or a consonant using the ternary operator.
//
//Sample Input 1:
//Enter a character: A
//Sample Output 1:
//Vowel