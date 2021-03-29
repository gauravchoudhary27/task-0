package com.company;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number= Sc.nextInt();
        if(number%2==0)
            System.out.println( number+"is Even number");
        else
            System.out.println(number+" is Odd number");




    }
}
