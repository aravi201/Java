package com.stack;

public class Stack {
	
	String empname;
	int salary;
	
	static String compname="lfg";
	static String loc="hyd";
	
	
	
	static void empdetails() {
		Stack s=new Stack();
		s.empname="aravindh";
		s.salary=20000;
		
		s.hello();
		
		System.out.println("company name:"+compname);
		System.out.println("location:"+loc);
		
		System.out.println("----------------------------");
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		empdetails();
		//callin s1.ram method then for instance method we frst call it using the object reference
		Stack s1=new Stack();
		s1.ram();

	}
	
	void hello() {
		System.out.println("employee name:"+empname);
		System.out.println("salary:"+salary);
		
	}
	void ram() {
		
		empname="vijay";
		salary=25000;
		System.out.println("employee name:"+empname);
		System.out.println("salary:"+salary);
		System.out.println("company name:"+compname);
		System.out.println("location:"+loc);
		
		
	}
	
	
	

}
