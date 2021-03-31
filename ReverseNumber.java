package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the any number");
        int num= Sc.nextInt();
        int reversed=0;
        while(num!=0)
        {
             int digit=num%10;
             reversed=reversed*10+digit;
             num/=10;
        }
        System.out.println("reverse number are"+ " "+ reversed);
    }
}
