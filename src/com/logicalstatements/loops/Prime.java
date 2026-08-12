package com.logicalstatements.loops;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		for(int i=2;i<=n;i++) {
			boolean boo=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					boo=false;
					break;
				}
			}
			if(boo) {
				System.out.print(i+" ");
			}
			
		}

	}

}
