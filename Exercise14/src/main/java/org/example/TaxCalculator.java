package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double subtotal, tax, total;

        System.out.print("What is the order amount? ");
        subtotal = scnr.nextInt();
        System.out.print("What is the state? ");
        String state = scnr.next();
        if (state.equals("WI")){
            tax = (.055*subtotal);
        }
        else{
            tax = (0);
        }

        String strSubtotal = String.format("%.2f", subtotal);
        String strTax = String.format("%.2f", tax);
        total = (subtotal + tax);
        String strTotal = String.format("%.2f", total);

        System.out.print("The subtotal is $" + strSubtotal + "\nThe tax is $" +strTax + "\nThe total is $" + strTotal);



    }
}
