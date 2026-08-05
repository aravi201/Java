package com.logicalstatements;

import java.util.Scanner;

public class Onlinevegandfruits {

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        double vegPrice = 0;
        double fruitPrice = 0;
        String choice;

        Scanner sc = new Scanner(System.in);
        do {//nested switch with do while
        System.out.println("Enter Category (veg / fruit) : ");
        String catg = sc.next();
   

        switch (catg) {

        // =================== VEGETABLES ===================

        case "veg" -> {

            System.out.println("Enter Item Code : ");
            String item = sc.next();

            switch (item) {

            case "tmt" -> {
                System.out.println("Tomato per kg = 50 rs");
                double tmtPrice = 50.0;
                vegPrice += tmtPrice;
            }

            case "ptt" -> {
                System.out.println("Potato per kg = 45 rs");
                double pttPrice = 45.0;
                vegPrice += pttPrice;
            }

            case "onn" -> {
                System.out.println("Onion per kg = 40 rs");
                double onnPrice = 40.0;
                vegPrice += onnPrice;
            }

            case "crt" -> {
                System.out.println("Carrot per kg = 60 rs");
                double crtPrice = 60.0;
                vegPrice += crtPrice;
            }

            case "bns" -> {
                System.out.println("Beans per kg = 80 rs");
                double bnsPrice = 80.0;
                vegPrice += bnsPrice;
            }

            case "cbg" -> {
                System.out.println("Cabbage per kg = 35 rs");
                double cbgPrice = 35.0;
                vegPrice += cbgPrice;
            }

            case "brj" -> {
                System.out.println("Brinjal per kg = 55 rs");
                double brjPrice = 55.0;
                vegPrice += brjPrice;
            }

            case "ldy" -> {
                System.out.println("Lady Finger per kg = 70 rs");
                double ldyPrice = 70.0;
                vegPrice += ldyPrice;
            }

            case "cuc" -> {
                System.out.println("Cucumber per kg = 40 rs");
                double cucPrice = 40.0;
                vegPrice += cucPrice;
            }

            case "chl" -> {
                System.out.println("Green Chilli per kg = 100 rs");
                double chlPrice = 100.0;
                vegPrice += chlPrice;
            }

            default -> System.out.println("Invalid Vegetable Code!");
            }
        }

        // =================== FRUITS ===================

        case "fruit" -> {

            System.out.println("Enter Item Code : ");
            String item = sc.next();

            switch (item) {

            case "orn" -> {
                System.out.println("Orange per kg = 100 rs");
                double ornPrice = 100.0;
                fruitPrice += ornPrice;
            }

            case "mng" -> {
                System.out.println("Mango per kg = 120 rs");
                double mngPrice = 120.0;
                fruitPrice += mngPrice;
            }

            case "apl" -> {
                System.out.println("Apple per kg = 180 rs");
                double aplPrice = 180.0;
                fruitPrice += aplPrice;
            }

            case "ban" -> {
                System.out.println("Banana per dozen = 70 rs");
                double banPrice = 70.0;
                fruitPrice += banPrice;
            }

            case "grp" -> {
                System.out.println("Grapes per kg = 90 rs");
                double grpPrice = 90.0;
                fruitPrice += grpPrice;
            }

            case "wml" -> {
                System.out.println("Watermelon per piece = 80 rs");
                double wmlPrice = 80.0;
                fruitPrice += wmlPrice;
            }

            case "pap" -> {
                System.out.println("Papaya per kg = 60 rs");
                double papPrice = 60.0;
                fruitPrice += papPrice;
            }

            case "pin" -> {
                System.out.println("Pineapple per piece = 90 rs");
                double pinPrice = 90.0;
                fruitPrice += pinPrice;
            }

            case "guv" -> {
                System.out.println("Guava per kg = 70 rs");
                double guvPrice = 70.0;
                fruitPrice += guvPrice;
            }

            case "pom" -> {
                System.out.println("Pomegranate per kg = 200 rs");
                double pomPrice = 200.0;
                fruitPrice += pomPrice;
            }

            case "mus" -> {
                System.out.println("Muskmelon per piece = 70 rs");
                double musPrice = 70.0;
                fruitPrice += musPrice;
            }

            case "str" -> {
                System.out.println("Strawberry per box = 150 rs");
                double strPrice = 150.0;
                fruitPrice += strPrice;
            }

            case "kwi" -> {
                System.out.println("Kiwi per piece = 35 rs");
                double kwiPrice = 35.0;
                fruitPrice += kwiPrice;
            }

            case "chk" -> {
                System.out.println("Chikoo per kg = 80 rs");
                double chkPrice = 80.0;
                fruitPrice += chkPrice;
            }

            case "cst" -> {
                System.out.println("Custard Apple per kg = 120 rs");
                double cstPrice = 120.0;
                fruitPrice += cstPrice;
            }

            case "lic" -> {
                System.out.println("Litchi per kg = 160 rs");
                double licPrice = 160.0;
                fruitPrice += licPrice;
            }

            case "coc" -> {
                System.out.println("Coconut per piece = 45 rs");
                double cocPrice = 45.0;
                fruitPrice += cocPrice;
            }

            case "pea" -> {
                System.out.println("Pear per kg = 140 rs");
                double peaPrice = 140.0;
                fruitPrice += peaPrice;
            }

            case "jam" -> {
                System.out.println("Jamun per kg = 100 rs");
                double jamPrice = 100.0;
                fruitPrice += jamPrice;
            }

            case "fig" -> {
                System.out.println("Fig per kg = 250 rs");
                double figPrice = 250.0;
                fruitPrice += figPrice;
            }

            default -> System.out.println("Invalid Fruit Code!");
            }
        }

        default -> System.out.println("Invalid Category!");
        }
        System.out.println("Do you want to add another item? (yes/no)");
        choice = sc.next();
        }while(choice.equalsIgnoreCase("yes"));

        System.out.println("\n========== BILL ==========");
        System.out.println("Vegetable Price : " + vegPrice);
        System.out.println("Fruit Price     : " + fruitPrice);
        System.out.println("Total Amount    : " + (vegPrice + fruitPrice));

        sc.close();
    }
}