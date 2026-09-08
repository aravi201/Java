package com.oops.polymorphism;

public class EngineerStudent extends Student {
	
	void calculateGrade(int marks) {
		if(marks>91) {
			System.out.println("Grade A");
		}
		else if(marks<91 && marks>75) {
			System.out.println("Grade B");
		}
		else if(marks<75 && marks>65) {
			System.out.println("Grade C");
		}
		else if(marks<65 && marks>35) {
			System.out.println("Grade d");
		}
		else {
			System.out.println("fail");
		}
	}

}
