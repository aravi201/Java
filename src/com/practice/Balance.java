package com.practice;

public class Balance {
	double amount=299.00;

	void main(String[] args) {
		System.out.println("main method started");
		showplanDetails();
		recharge(299);
		System.out.println("main method ended");
		// TODO Auto-generated method stub

	}
	void showplanDetails() {
		System.out.println("current recharge plan");
		System.out.println("plan name:unlimited 299");
		System.out.println("validity:28 days");
		System.out.println("data:1.5gb/day");
		System.out.println("calls:unlimited");
		
		System.out.println("------------------------------------------");
	}
	void recharge(double amount) {
		System.out.println("recharge successfull");
		System.out.println("Recharge amount:"+amount);
		
	}

}
//Today Task
//Java
//Mobile Recharge
//1.Write a Java program to demonstrate the following types of methods:
//1.No Return Type + No Arguments
//Create a method void showPlanDetails() to display the current recharge plan.
//
//2.No Return Type + With Arguments
//Create a method void recharge(double amount) to accept the recharge amount and display the successful recharge message.
//
//Output for no arguments
//Current Recharge Plan
//Plan Name : Unlimited 299
//Validity  : 28 Days
//Data      : 1.5 GB/Day
//Calls     : Unlimited
//
//Output for argument
//Recharge Successful!
//Recharge Amount : ₹299.0