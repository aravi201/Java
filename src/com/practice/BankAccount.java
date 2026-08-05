package com.practice;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		BankAccount t=new BankAccount();
		t.displayAccount();

	}
	void displayAccount() {
		int acc_num=10;
		String  name="Aravindh";
		String Acc_type="savings";
		Double balance=550.0;
		
		System.out.println("account number:"+acc_num);
		System.out.println("Account holder name:"+name);
		
		System.out.println("Account type:"+Acc_type);
		System.out.println("remaining balance:"+balance);
		
	}
	

}








//.Create a class named BankAccount.
//2.Create a method displayAccount() with no arguments and no return type.
//3.Inside the method, display Account Number, Account Holder Name, Account 4.Type, and Balance.
//Call the method from the main() method.