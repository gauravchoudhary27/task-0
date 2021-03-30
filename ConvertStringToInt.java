package com.company;

import java.util.Scanner;

public class ConvertStringToInt {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the first String");
        String X= Sc.nextLine();
        System.out.println("enter the second String");
        String Y=Sc.nextLine();
        System.out.println("convert string into the integer");
        int A=Integer.parseInt(X);
        int B=Integer.parseInt(Y);

        System.out.println(A);
        System.out.println(B);

    }
}
