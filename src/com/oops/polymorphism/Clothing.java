package com.oops.polymorphism;

public class Clothing extends Product{
	String clothtype;
	
	
	Clothing(int productid,String productname,double price,String clothtype){
		super(productid,productname,price);
		this.clothtype=clothtype;
		
	}
	void displayproductdetails() {
		super.displayproductdetails();
		System.out.println("clothtype:"+clothtype);
	}
	
	double calculateDiscount() {
		return price *0.05;
	}
	
}

