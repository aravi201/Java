package com.Methods;

import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner(System.in);

    // Instance Variables
    int id;
    String name;
    int age;
    String depart;
    int marks;

    // 1. Without Arguments & Without Return Type
    void studentdetails() {

        System.out.println("Enter the ID:");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name:");
        name = sc.nextLine();

        System.out.println("Enter the Age:");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Department:");
        depart = sc.nextLine();

        System.out.println("Enter the Marks:");
        marks = sc.nextInt();

        System.out.println("\nStudent Details Added Successfully!\n");
    }

    // 2. With Arguments & Without Return Type
    void displayStudent(int id, String name, int age, String depart, int marks) {

        System.out.println("----------- Student Details -----------");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Department   : " + depart);
        System.out.println("Marks        : " + marks);
    }

    // 3. Without Arguments & With Return Type
    String calculateGrade() {

        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "Fail";
    }

    // 4. With Arguments & With Return Type
    boolean isPass(int marks) {

        return marks >= 35;
    }

    public static void main(String[] args) {

        Student s = new Student();

        // Method 1
        s.studentdetails();

        // Method 2
        s.displayStudent(s.id, s.name, s.age, s.depart, s.marks);

        // Method 3
        String grade = s.calculateGrade();
        System.out.println("Grade : " + grade);

        // Method 4
        boolean result = s.isPass(s.marks);
        System.out.println("Pass : " + result);
    }
}