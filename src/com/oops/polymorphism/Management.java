package com.oops.polymorphism;

public class Management extends Student {
	
	void calculateGrade(int marks) {
		if(marks>90) {
			System.out.println("Grade A");
		}
		else if(marks<90 && marks>76) {
			System.out.println("Grade B");
		}
		else if(marks<76 && marks>65) {
			System.out.println("Grade C");
		}
		else if(marks<65 && marks<37) {
			System.out.println("Grade d");
		}
		else {
			System.out.println("fail");
		}
	}
	

}
