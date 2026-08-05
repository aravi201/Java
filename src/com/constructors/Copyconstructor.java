package com.constructors;

public class Copyconstructor {
	int empid;
	String empname;
	double salary;
	Copyconstructor(int empid,String empname,double salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		
	}
	Copyconstructor(Copyconstructor c1){
		this.empid=c1.empid;
		this.empname=c1.empname;
		this.salary=c1.salary;
	}
	void incrementSalary(double amount) {
		this.salary+=amount;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Copyconstructor c1=new Copyconstructor(101,"Aravindh",50000);
		
		Copyconstructor c2=new Copyconstructor(c1);
		
		c2.incrementSalary(10000);
		c2.empname="Ajay";
		
		c1.display("employee1 details");
		c2.display("employee2 details");
		
		
		// TODO Auto-generated method stub

	}
	void display(String label) {
		System.out.println("employee details");
		System.out.println("employee id:"+empid);
		System.out.println("employee name :"+empname);
		System.out.println("empoyee salary:"+salary);
		System.out.println("------------------------");
	}

}
//Java
//1.Create a class Employee with the following requirements:
//Instance variables:
//int empId
//String empName
//double salary
//Create:
//1.A parameterized constructor to initialize the object.
//A copy constructor that copies the data from another Employee object.
//2.Create the following methods:
//display() – Displays employee details.
//incrementSalary(double amount) – Increases the salary by the given amount.
//In the main() method:
//3.Create emp1 using the parameterized constructor.
//.Create emp2 using the copy constructor by copying emp1.
//Increase the salary of emp2 by 10000.
//.Change the name of emp2 to "Ravi".
//.Display both objects.
//4.Verify that changes made to emp2 do not affect emp1.
//
//Expected Output
//Employee 1
//ID     : 101
//Name   : Krishna
//Salary : 50000.0
//
//Employee 2
//ID     : 101
//Name   : Ravi
//Salary : 60000.0