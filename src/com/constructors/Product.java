package com.constructors;

public class Product {
	int productId;
	String Product_name;
	double price;

	Product(int productId, String Product_name, double price) {
		this.productId = productId;
		this.Product_name = Product_name;
		this.price = price;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Product m = new Product(1, "pen", 5.0);
		m.show();

		Product n = new Product(2, "book", 50.0);
		n.show();

		Product o = new Product(3, "dove", 5.0);
		o.show();

		// TODO Auto-generated method stub

	}

	void show() {
		System.out.println(productId);
		System.out.println(Product_name);
		System.out.println(price);
	}

}
//Today Task
//1.Product Details
//Create a class Product with:
//productId
//productName
//price
//2.Use a parameterized constructor to initialize the fields.
//3.Create at least 3 Product objects and display their details.