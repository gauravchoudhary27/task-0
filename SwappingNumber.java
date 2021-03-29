package com.company;

import java.util.Scanner;

public class SwappingNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the two values");
        int X= Sc.nextInt();
        int y= Sc.nextInt();
        System.out.println("Before the Swapping the Value" +  "\n " + X+ "  "+y);
        int Z=X;
        X=y;
        y=Z;
        System.out.println("After Swapping the values\n"+ X+" " +y );





    }
}
