package com.practice;
public class TT  { 
	void arearectangle() {
		
		int length=10;
		int breadth=15;
		
		
		int area=length*breadth;
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
		
		System.out.println("Area of rectangle: " + area);
	}
	

	public static void main(String[] args) {
		
		TT ar=new TT();
		ar.arearectangle();
		 

	}

}
