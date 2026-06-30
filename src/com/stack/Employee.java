package com.stack;

public class Employee {
	
	static String Companyname;
	static String location;
	
	String employee_name;
	int salary;
	
	static {
		Companyname="techpark";
		location="hyderabad";
		System.out.println("static block executed");
		
	}
	{
		System.out.println("instance block executed");
	}
	public void displaydetails() {
		System.out.println("Company name:"+Companyname);
		System.out.println("Location:"+location);
		System.out.println("employee name:"+employee_name);
		System.out.println("salary:"+salary);
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		System.out.println("creating employee 1 details");
		Employee e1=new Employee();
		
		System.out.println("creating employee 2 details");
		Employee e2=new Employee();
		System.out.println();
		
		
		e1.employee_name="aravindh";
		e1.salary=80000;
		
		e2.employee_name="vijay";
		e2.salary=70000;
		
		System.out.println("employee 1 details");
		e1.displaydetails();
		
		System.out.println("employee 2 details");
		e2.displaydetails();
		
		
		

	}

}
