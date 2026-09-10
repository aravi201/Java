package com.oops.polymorphism;

public class Furniture extends Product {
	String furniturename;
	
	
	Furniture(int productid,String productname,double price,String furniturename){
		super(productid,productname,price);
		this.furniturename=furniturename;
		
	}
	void displayproductdetails() {
		super.displayproductdetails();
		System.out.println("furniturename:"+furniturename);
	}
	
	double calculateDiscount() {
		return price *0.20;
	}
	
}


