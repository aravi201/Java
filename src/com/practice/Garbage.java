package com.practice;

public class Employee {

    static void work() {

        Employee e = new Employee();

        System.out.println("Employee object created");
    }

    public static void main(String[] args) {

        work();

        System.out.println("Work method completed");
    }
}