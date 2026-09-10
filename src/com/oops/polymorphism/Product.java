package com.oops.polymorphism;

public class Product {
	int productid;
	String productname;
	double price;
	
	Product(int productid,String productname,double price){
		this.productid=productid;
		this.productname=productname;
		this.price=price;
	}
	void displayproductdetails() {
		System.out.println("prodcut_id:"+productid);
		System.out.println("product_name:"+productname);
		System.out.println("price:"+price);
	}
	double calculateDiscount() {
		return 0;
	}
	
	

}
//1.Create a parent class Product with fields productId, productName, and price, and a method displayProductDetails().
//Create child classes Electronics, Clothing, and Furniture that extend Product.
//Add one additional field to each child class (brand, size, and material respectively).
//Override the method calculateDiscount() in each child class to calculate different discount percentages.
//In the main() method, create objects of all child classes and display the product details, discount, and final price.