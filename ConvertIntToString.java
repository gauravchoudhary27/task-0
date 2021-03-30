package com.company;

import java.util.Scanner;

public class ConvertIntToString {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the first number ");
        int X= Sc.nextInt();
        System.out.println("enter the second number");
        int Y= Sc.nextInt();

        System.out.println("convert int into the string");

        String A= String.valueOf(X);
        String B= String.valueOf(Y);
        System.out.println(A+" "+B);

    }
}
