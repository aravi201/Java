package com.logicalstatements.loops;

public class Reversealp {
	
	//printing uppercase alphabets
	
	static void uppercase() {
		System.out.print("UPPERCASE LETTERS: ");
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}//lowercase
	static void lowercase() {
		System.out.print("lowercase letters: ");
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch+" " );
		}
		System.out.println();
	}//reverse lower
	static void lowerreverse() {
		System.out.print("reverseing lower alphabets: ");
		for(char ch='z';ch>='a';ch--) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}//reversing upper
	static void upperreverse() {
		System.out.print("reversing upper alphabets:  ");
		for (char ch='Z';ch>='A';ch--) {
			System.out.print(ch+" ");
		}
	}

	public static void main(String[] args) {
		
		uppercase();
		lowercase();
		lowerreverse();
		upperreverse();
		
		
		
		

	}

}
//.Print Alphabets in Reverse Order