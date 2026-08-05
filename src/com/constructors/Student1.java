package com.constructors;

public class Student1 {
	int id;
	String name;
	String course;
	Student1(){
		id=0;
		name="Unknown";
		course="Unknown";
		System.out.println("constructor called");
	}
	Student1(int id){
		this();
		this.id=id;
		System.out.println("id is called");
	}
	Student1(int id,String name){
		this(id);
		this.name=name;
		System.out.println("id and name is called");
	}
	Student1(int id,String name,String course){
		this(id,name);
		this.course=course;
		System.out.println("id and name and course is called");
	}

	public static void main(String[] args) {
		
		Student1 s=new Student1();
		System.out.println("Student 1 details");
		s.display();
		
		Student1 s1=new Student1(101);
		System.out.println("student 2 details");
		s1.display();
		Student1 s2=new Student1(101,"Aravindh");
		System.out.println("student 3 details");
		s2.display();
		Student1 s3=new Student1(101,"Aravindh","JFS");
		System.out.println("student 3 details");
		s3.display();
		
		
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println("Id is:"+id);
		System.out.println("the name is:"+name);
		System.out.println("**************");
	}

}
//Problem 1: Student
//Fields
//id
//name
//Constructors
//Student()
//Student(int id)
//Student(int id, String name)
//Constraints
//Student(int id) should call Student().
//Student(int id, String name) should call Student(int id).
//Display all details.