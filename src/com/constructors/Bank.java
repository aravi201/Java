package com.constructors;

public class Bank {
	String accholder;
	long accnum;
	double balance;
	
	Bank(){
		accholder="unknown";
		accnum=0;
		balance=5.0;
		System.out.println("no arg constructor is called");
	}
	Bank(String accholder){
		this();
		this.accholder=accholder;
		System.out.println("one arg constructor is called");
	}
	Bank(String accholder,long accnum){
		this(accholder);
		this.accnum=accnum;
		System.out.println("two arg constructor called");
	}
	Bank(String accholder,long accnum,double balance){
		this(accholder,accnum);
		this.balance=balance;
		System.out.println("three arg constructor called");
	}

	public static void main(String[] args) {
		
		Bank b1= new Bank();
		b1.display();
		
		Bank b2=new Bank("Aravindh");
		b2.display();
		
		Bank b3=new Bank("Aravindh",123456765);
		b3.display();
		
//		Bank b4=new Bank("Aravindh",123456765,50000.0);
//		b4.display();
		
		
		
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println("the bank account details");
		System.out.println("the account holder:"+accholder);
		System.out.println("the account number"+accnum);
		System.out.println("the balance amount:"+balance);
		System.out.println("--------------------------------------");
	}

}
//Java
//Bank Account Management using Constructor Chaining
//Create a class BankAccount with the following overloaded constructors:
//BankAccount()
//BankAccount( accountHolder)
//BankAccount( accountHolder,  accountNumber)
//BankAccount( accountHolder,  accountNumber,  balance)
//Requirements
//1.Use constructor chaining with this().
//2.The final constructor should initialize all instance variables.
//3.Create a display() method to print all account details.
//In the main() method:
//4.Create one object using the default constructor.
//5.Create another object using the constructor with only the account holder's name.
//6.Create another object using the constructor with name and account number.
//7.Create the final object using all three values.
//Display the details of all objects.
//
//Sample Output
//Account Holder : Unknown
//Account Number : 0
//Balance        : 0.0
//
//Account Holder : Krishna
//Account Number : 0
//Balance        : 0.0
//
//Account Holder : Krishna
//Account Number : 1234567890
//Balance        : 0.0
//
//Account Holder : Krishna
//Account Number : 1234567890
//Balance        : 50000.0