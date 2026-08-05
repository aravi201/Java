package com.practice;

public class Wrappers {
	
	Integer Product_id;
	String product_name;
	Integer Price;
	Double rating;
	Boolean product_available_status;
	Integer stock_qnty;
	Integer discount_percentage;
	Integer product_code;
	

	public static void main(String[] args) {
		
		Wrappers w=new Wrappers();
		w.Product_id=101;
		w.product_name="Detergent powder";
		w.Price=100;
		w.rating=4.5;
		w.product_available_status=true;
		w.stock_qnty=105;
		w.discount_percentage=20;
		w.product_code=234;
		
		System.out.println("product id:"+w.Product_id);
		System.out.println( "product name:"+w.product_name);
		System.out.println("price:"+w.Price);
		System.out.println("rating:"+w.rating);
		System.out.println("product avaialble status:"+w.product_available_status);
		System.out.println("stock quantity:"+w.stock_qnty);
		System.out.println("discount percentage:"+w.discount_percentage);
		System.out.println("product code:"+w.product_code);
		
		
		 

	}

}
