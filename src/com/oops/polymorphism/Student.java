package com.oops.polymorphism;

public class Student {
	
	void calculateGrade(int marks) {
		System.out.println("the Student Grade");
		
	}
	
	

}
//.Create a parent class Student with method calculateGrade().
//Create child classes EngineeringStudent, MedicalStudent, ManagementStudent overriding it with their own grading criteria.
//Accept marks from user.
//Use a parent class reference to hold child objects.
//Demonstrate runtime polymorphism by calling calculateGrade().