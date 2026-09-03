package com.logicalstatements.loops;

import java.util.Random;

import java.util.Scanner;

public class Randomnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int a=r.nextInt(10)+1;
		//System.out.println("Random numbers is:"+a);
		
		boolean won=false;
		
		for(int att=1;att<=3;att++) {
			System.out.print("Attempt " + att + ": Enter your guess (1-10): ");
			int guess=sc.nextInt();
			
			if(guess==a) {
				System.out.println("you won the game");
				won=true;
				break;
				
			}else {
				int chancesleft=3-att;
				
				
				
				if(chancesleft>0) {
					System.out.println("try again");
					System.out.println("chances left:"+chancesleft);
			}
				
			}
			
			
		}if(!won) {
			System.out.println("you lost the game");
			System.out.println("the correct number was:"+a);
		}
		
		

	}

}
//Write a Java program that generates a random number between 1 and 10. The user gets 3 chances to guess the number.
//
//If the user guesses correctly, display "You Won!" and stop the game.
//If all 3 attempts are wrong, display "You Lost!" and show the random number.