package com.Methods;

public class Personaldetails {

	void main(String[] args) {
		System.out.println("hi");
		Details();
		education();
		email("aravindhsura55@gmail.com");

	}
	
	void Details(){
		String name="Aravindh";
		int age=23;
		String gender="M";
		long phone_no=7997083942l;
		
		
		System.out.println("my name is:"+name);
		System.out.println("my age is:"+age);
		System.out.println("my gender is:"+gender);
		System.out.println("phone number is:"+phone_no);
		System.out.println("--------------------------------------");
		
	}
	void education(){
		String college="CMR technical campus";
		String branch="CSM";
		String qualification="B tech";
		double percentage=83.00;
		System.out.println("college name is:"+college);
		System.out.println("branch name:"+branch);
		System.out.println("qualification:"+qualification);
		System.out.println("percentage:"+percentage);
		

	}
	void email(String mail) {
		System.out.println("mail id:"+mail);
	}
	
	
	

}
