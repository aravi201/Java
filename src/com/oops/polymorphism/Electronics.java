package com.oops.polymorphism;

public class Electronics extends Product{
	String brand;
	
	
	Electronics(int productid,String productname,double price,String brand){
		super(productid,productname,price);
		this.brand=brand;
		
	}
	void displayproductdetails() {
		super.displayproductdetails();
		System.out.println("brand:"+brand);
	}
	
	double calculateDiscount() {
		return price *0.10;
	}
	
}
