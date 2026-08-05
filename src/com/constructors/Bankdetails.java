package com.constructors;

public class Bankdetails {
	String name;
	static String bank="SBI";
	static String ifsc="SBIN080";
	double balance;
	static long accno=123456;
	Bankdetails(String name,double balance){
		accno++;
		this.name=name;
		
		this.balance=balance;
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Bankdetails b=new Bankdetails("aravindh",567.00);
		b.display();
		Bankdetails b1=new Bankdetails("Ajay",387.00);
		b1.display();
		
		// TODO Auto-generated method stub
		System.out.println("main method ended");

	}
	void display() {
		System.out.println("****************************");
		System.out.println("the account holder no:"+accno);
		System.out.println("the account holder name:"+name);
		System.out.println("the account holder bank:"+bank);
		System.out.println("the account holder ifsc:"+ifsc);
		System.out.println("the account holder balance:"+balance);
		System.out.println("*************");
		
	}

}
