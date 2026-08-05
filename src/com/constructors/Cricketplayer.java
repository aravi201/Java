package com.constructors;

import java.util.Scanner;

public class Cricketplayer {
	String player_name;
	int matches_played;
	int total_runs;
	int avg;
	 public Cricketplayer(String player_name,int matches_played,int total_runs) {
		 this.player_name=player_name;
		 this.matches_played=matches_played;
		 this.total_runs=total_runs;
		 this.avg=total_runs/matches_played;
		 
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the player name:");
		String player_name=sc.nextLine();
		
		System.out.println("enetr matches played:");
		int matches_played=sc.nextInt();
		System.out.println("enter the total runs:");
		int total_runs=sc.nextInt();
		Cricketplayer cp=new Cricketplayer(player_name,matches_played,total_runs);
		// TODO Auto-generated method stub
		cp.display();
		sc.close();

	}
	void display() {
		System.out.println("player name:"+this.player_name);
		System.out.println("matches played:"+this.matches_played);
		System.out.println("total runs:"+this.total_runs);
		System.out.println("the average is:"+this.avg);
	}

}
//Java Assignment – Argument Constructor
//1.Cricket Player Statistics
//Create a class CricketPlayer with the following data members:
//Player Name
//Matches Played
//Total Runs
//Initialize all the values using an argument (parameterized) constructor.
//Create a method to calculate and display the average runs per match using the formula:
//Average Runs = Total Runs / Matches Played
//Read the values using the Scanner class, create an object by passing the values to the constructor, and display all the player details along with the average runs.
//
//Sample Input:
//Enter Player Name: Virat Kohli
//Enter Matches Played: 100
//Enter Total Runs: 5000
//
//Expected Output:
//Player Name      : Virat Kohli
//Matches Played   : 100
//Total Runs       : 5000
//Average Runs     : 50.0