package com.Methods;

import java.util.Scanner;

public class Salary {
	void salarySlip(String employeeName, double basicSalary) {
				
		double HRA=basicSalary*(20/100.0);
		double DA=basicSalary*(10/100.0);
		double Gross_salary=basicSalary+HRA+DA;
		
		System.out.println("--Salary slip--");
		System.out.println("Employee name:"+employeeName);
		System.out.println("basic salary:"+basicSalary);
		System.out.println("HRA:"+HRA);
		System.out.println("DA:"+DA);
		System.out.println("Gross salary:"+Gross_salary);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name:");
        String name = sc.nextLine();

        System.out.println("enter the salary");
        double salary=sc.nextDouble();
        
        Salary m=new Salary();
        m.salarySlip(name,salary);
        sc.close();
       
        

	}

}
//Java Assignment – Methods with Scanner
//Task: Salary Slip Generator
//Create a Java program that reads the employee name and basic salary using the Scanner class.
//Create a method:
//void salarySlip(String employeeName, double basicSalary)
//Inside the method, calculate and display the following:
//HRA = 20% of the Basic Salary
//DA = 10% of the Basic Salary
//Gross Salary = Basic Salary + HRA + DA
//
//Sample Input:
//Enter Employee Name: Krishna
//Enter Basic Salary: 30000
//
//Formula
//HRA = Basic Salary × 20 / 100
//DA = Basic Salary × 10 / 100
//Gross Salary = Basic Salary + HRA + DA