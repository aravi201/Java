package com.constructors;
import java.util.Scanner;
public class Products {
	String product_name;
	double price;
	int Quantity;
	Products(){
		this("unknown");
	}
	Products(String product_name){
		this.product_name=product_name;
		
		
	}
	Products(String product_name,double price){
		this(product_name,price,0);
	}
	Products(String product_name,double price,int Quantity){
		this.product_name=product_name;
		this.price=price;
		this.Quantity=Quantity;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product name:");
		String product_name=sc.nextLine();
		
		System.out.println("Enter the price:");
		Double price=sc.nextDouble();
		
		System.out.println("enter the quantity:");
		int Quantity=sc.nextInt();
		
		Products p1=new Products(product_name,price,Quantity);
		p1.dispaly();
		sc.close();
		// TODO Auto-generated method stub

	}
	void dispaly() {
		double Total_cost=price*Quantity;
		System.out.println("Product name:"+product_name);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+Quantity);
		System.out.println("Total_cost:"+Total_cost);
	}

}
//Java
//1.Product Billing
//Create a class Product with overloaded 2.constructors:
//Product()
//Product( productName)
//Product( productName,  price)
//Product( productName,  price,  quantity)
//Requirement:
//3.Use constructor chaining.
//In the final constructor, calculate and display the Total Cost.
//
//Sample Input
//Enter Product Name: Laptop
//Enter Price: 55000
//Enter Quantity: 2
//
//Expected Output
//Product Name : Laptop
//Price        : 55000.0
//Quantity     : 2
//Total Cost   : 110000.0
//
//Mysql
//1.Display the top 3 employees with the highest commission.
//2.Display the 4th and 5th highest-paid employees.