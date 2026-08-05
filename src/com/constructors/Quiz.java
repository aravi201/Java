package com.constructors;

public class Quiz {
	String subject;
	int tquestions;
	int timelimit;
	
	
	Quiz(){
		subject="GK";
		tquestions=30;
		timelimit=20;
		System.out.println("no arg constructor called");
	}
	Quiz(String subject){
		this();
		this.subject=subject;
		System.out.println("one arg constructor is called");
	}
	Quiz(String subject,int tquestions){
		this(subject);
		this.tquestions=tquestions;
		System.out.println("two arg constructor is called");
	}
	Quiz(String subject,int tquestions,int timelimit){
		this(subject,tquestions);
		this.timelimit=timelimit;
		System.out.println("three arg constructor is called");
	}

	public static void main(String[] args) {
		Quiz q1=new Quiz("java",50,60);
		q1.display();
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println("Quiz details");
		System.out.println("Subject          : " + subject);
        System.out.println("Total Questions  : " + tquestions);
        System.out.println("Time Limit       : " + timelimit + " minutes");
	}

}
//Java
//1.Task 5: Quiz Application (Tricky)
//Create a class Quiz.
//Constructors:
//Quiz()
//Quiz( subject)
//Quiz( subject,  totalQuestions)
//Quiz( subject,  totalQuestions,  timeLimit)
//Requirement:
//1.Every constructor must print a different message.
//2.Use this() to chain all constructors.
//3.Create only one object using the Noarg constructor and observe the execution order.