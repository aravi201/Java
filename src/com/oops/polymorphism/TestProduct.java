package com.oops.polymorphism;

public class TestProduct {

	public static void main(String[] args) {
		Electronics e=new Electronics(1,"bulb",50.0,"wipro");
		Furniture f=new Furniture(1,"sofa",32000.00,"Sof_sufa");
		Clothing c=new Clothing(1,"cloth",1000.00,"shirt");
		
		
		System.out.println("--Electronics----");
		e.displayproductdetails();
		System.out.println("the disvount for product:"+e.calculateDiscount());
		System.out.println("the final price:"+(e.price-e.calculateDiscount()));
		
		System.out.println("--furniture----");
		f.displayproductdetails();
		System.out.println("the disvount for product:"+f.calculateDiscount());
		System.out.println("the final price:"+(f.price-f.calculateDiscount()));
		
		System.out.println("--Clothing----");
		c.displayproductdetails();
		System.out.println("the disvount for product:"+c.calculateDiscount());
		System.out.println("the final price:"+(c.price-c.calculateDiscount()));

	}

}
