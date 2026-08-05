package com.Methods;
import java.util.Scanner;

public class PrimeCheck {

    // Method with arguments, no return type
    static void isPrime(int num) {
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check:");
        int n = sc.nextInt();
        isPrime(n);

        sc.close();
    }
}

