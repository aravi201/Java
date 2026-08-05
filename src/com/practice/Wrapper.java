package com.practice;

public class Wrapper {
	
	Integer Ticket_id=101;
	Integer Screen_no=2;
	Integer Ticket_pric=503;
	Boolean status=true;
	Integer Age=45;
	Integer no_of_ticket=3;
	Long number=98765433345l;
	Integer GST_amt=33;
	
	public static void main(String[] args) {
		
		
		Wrapper t1=new Wrapper();
		System.out.println("ticket id:"+t1.Ticket_id);
		System.out.println("Screen no:"+t1.Screen_no);
		System.out.println("Ticket price:"+t1.Ticket_pric);
		System.out.println("Ticket status:"+t1.status);
		System.out.println("Age:"+t1.Age);
		System.out.println("no of tickets:"+t1.no_of_ticket);
		System.out.println("number:"+t1.number);
		System.out.println("GST Amount:"+t1.GST_amt);
		
		
		
		
		
	}

}
//Write a Java program to store the following movie ticket details in appropriate variables:
//Ticket ID
//Screen Number
//Ticket Price
//Online Booking Status
//Viewer Age
//Number of Tickets
//Contact Number
//GST Amount
//2.Print all the ticket details in a clear and readable format.