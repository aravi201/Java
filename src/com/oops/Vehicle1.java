package com.oops;


class Vehicle{
	int speed=50;
	
	void display() {
		System.out.println("vehicle Started:"+speed);
	}
}
class Car extends Vehicle{
	int speed=100;

	void display() {
		System.out.println("Car Started:"+speed);
	}
}

public class Vehicle1 {

	public static void main(String[] args) {
		Vehicle v=new Car();
		
		System.out.println("the vehicle speed is:"+v.speed);
		
		v.display();

		
//		Vehicle v1=new Vehicle();
//		v1.start();
		
		
//		Exception in thread "main" java.lang.ClassCastException: class com.oops.Vehicle cannot be cast to class com.oops.Car (com.oops.Vehicle and com.oops.Car are in unnamed module of loader 'app')
//		at com.oops.Vehicle1.main(Vehicle1.java:26)
//		Car c2=(Car)new Vehicle();
//		c2.drive();
//		c2.start();
//		
//		Vehicle v2=new Car();
//		v2.start();
		
		

	}

}
//1.Create a Vehicle class with a start() method. Create a Car class that inherits Vehicle and has a drive() method.


//1.Create a Java program using inheritance with a parent class Vehicle and a child class Car.
//Requirements:
//Vehicle should have a variable speed = 50 and a method display().
//Car should have its own variable speed = 100 and override the display() method.
//Create a Car object using a parent-class reference.
//Access the speed variable and call the display() method.
//Predict the output before running the program.
//Explain why the variable and method behave differently. 
