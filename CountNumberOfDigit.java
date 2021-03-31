package com.company;

import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number of digit ");
        int num= Sc.nextInt();
        int count= 0;

        while(num!=0)
        {
            num/=10;
            ++count;
        }
        {
            System.out.println(" number of digit are" +" " + count);
        }
    }
}
