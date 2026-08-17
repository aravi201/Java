package com.logicalstatements.loops;

import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the marks of 10 students");
		
		int [] marks=new int[10];
		int above=0;
		int below=0;
		int highest=0;
		for(int i=1;i<10;i++) {
			marks[i]=sc.nextInt();
			
			if(marks[i]>40) {
				above++;
			}else {
				below++;
			}
			if(marks[i]>highest) {
				highest=marks[i];
			}
			
		}
		System.out.println("the student scored above 40:"+above);
		System.out.println("the student scored below 40:"+below);
		System.out.println("the highest marks:"+highest);
	}

}
