package com.arrays;

import java.util.Scanner;

public class Matrixdisplay {

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
		System.out.println("the matrix format");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
