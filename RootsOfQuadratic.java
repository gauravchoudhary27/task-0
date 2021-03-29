package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RootsOfQuadratic {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        int a= Sc.nextInt(),b= Sc.nextInt(),c= Sc.nextInt();
        int Z=b*b-4*a*c;
        if(Z>0)
            System.out.println("Equation has real roots");
        else if(Z<0)
            System.out.println("Equation has imaginary roots");
        else
            System.out.println("Equation has equal roots");


    }
}
