package com.company;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of dividend");
        int Dividend = sc.nextInt();
        System.out.println(" Please enter the value of  divisor");
        int Divisor = sc.nextInt();
        int Quotient = Dividend / Divisor;
        int Remainder = Dividend % Divisor;
        System.out.println("Quotient  \n " + Quotient);
        System.out.println("Remainder  \n " + Remainder);
    }
}