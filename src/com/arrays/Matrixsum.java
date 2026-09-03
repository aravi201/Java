package com.arrays;

import java.util.Scanner;

public class Matrixsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size");
		int row=sc.nextInt();
		System.out.println("enter the coloum size");
		int column=sc.nextInt();
		
		int[][] matrix=new int[row][column];
		
		
		System.out.println("enter the matrix elemnets");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				sum+=matrix[i][j];
			}
			
		}
		System.out.println("the sum of matrix elements:"+sum);

	}

}
//1.Write a Java program to read a 3 × 3 matrix and find the sum of all its elements.
//Input: 1 2 3
//           4 5 6
//           7 8 9
//Output : Sum of all elements = 45
