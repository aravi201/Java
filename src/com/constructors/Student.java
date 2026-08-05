package com.constructors;

public class Student {
	int id;
	String name;
	int age;

	Student() {
		id = 2;
		name = "aravindh";
		age = 18;
	}

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "aravindh", 23);
		Student s2 = new Student(2, "ajay", 23);

		s1.display();
		s2.display();

	}

	void display() {
		System.out.println("details of Student");
		System.out.println("the id:" + id);
		System.out.println("the name of the student:" + name);
		System.out.println("the age of the student:" + age);
	}

}
//1. Student Constructor
//Problem
//
//Create a Student class with the following fields:
//
//id
//name
//age
//
//Create a default constructor that assigns default values.
//
//Constraints
//Use a no-argument constructor.
//Display all values.
//Create two objects.