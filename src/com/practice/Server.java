package com.practice;

import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length();i++) {
			count++;
		}System.out.println(count);

		
		

	}

}

//  a server compresses its log strings tosave space.
//the compresion rule is:k[encoded_string],where the encoded_string inside the square brackets is repeated exactly k times.
//k is always a postive integer.writee a program to decode the compressed server log.
//note: you can assume the input string is always valid and contains no extra spaces

//input&output format
//input: a single string s representing the encoded log.
//output: a single string representing the decoded log.
//cons:
// 1<=s.length<=30
//s consistes of lower case english letters,digits,and square brackets[].


