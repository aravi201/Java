package com.constructors;

import java.util.Scanner;
public class Patient {
	String pname;
	int age;
	double room_charge_per_day;
	int admitted;
	Patient(String pname,int age,double room_charge_per_day,int admitted){
		this.pname=pname;
		this.age=age;
		this.room_charge_per_day=room_charge_per_day;
		this.admitted=admitted;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter patient name:");
		String pname=sc.nextLine();
		
		System.out.print("Enter age:");
		int age=sc.nextInt();
		
		System.out.print("Enter room charge per day:");
		double room_charge_per_day=sc.nextDouble();
		
		System.out.print("Enter number of days admitted:");
		int admitted=sc.nextInt();
		
		Patient p=new Patient(pname,age,room_charge_per_day,admitted);
		
		p.display();
		
		
		sc.close();
	}
	void display() {
		System.out.println("*****************************************");
		double total_bill=room_charge_per_day*admitted;
		System.out.println("patient name:"+pname);
		System.out.println("Age:"+age);
		System.out.println("Room charge per day:"+room_charge_per_day);
		System.out.println("days admitted:"+admitted);
		System.out.println("Total hospital bill:"+total_bill);
	}

}
//Java Assignment – Parameterized Constructor
//1.Hospital Patient Bill
//Create a class Patient with the following data members:
//Patient Name
//Age
//Room Charge Per Day
//Number of Days Admitted
//2.Initialize all the values using a parameterized constructor.
//3.Create a method to calculate and display the 4.Total Hospital Bill using the following formula:
//Total Hospital Bill = Room Charge Per Day × Number of Days Admitted
//5.Read the values using the Scanner class, create an object by passing the values to the parameterized constructor, and display all the patient details along with the total hospital bill.
//
//Sample Input:
//Enter Patient Name: Rahul
//Enter Age: 35
//Enter Room Charge Per Day: 2500
//Enter Number of Days Admitted: 4
//
//Expected Output:
//Patient Name          : Rahul
//Age                   : 35
//Room Charge Per Day   : 2500.0
//Days Admitted         : 4
//Total Hospital Bill   : 10000.0