package com.Operators;
import java.util.Scanner;
public class Vote {
	
	void Eligible(int age) {
		
		String result=(age>=18)?"eleigible":"noteligble";
		System.out.println("result:"+result);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the age:");
		int age=sc.nextInt();
		
		Vote v=new Vote();
		v.Eligible(age);
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
