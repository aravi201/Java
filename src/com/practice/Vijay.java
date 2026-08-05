package com.practice;

public class Vijay{
	int len;
	int breadth;
	void areareactangle(){
		
		len=10;
		breadth=15;
		
		int area=len*breadth;
		
		System.out.println("Area of Reactangle:"+area);
		}
	public static void main(String[] args) {
		
		Vijay ar=new Vijay();
		ar.areareactangle();
		
	}
}

