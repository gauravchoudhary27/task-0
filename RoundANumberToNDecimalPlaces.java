package com.company;

import java.util.Scanner;

public class RoundANumberToNDecimalPlaces {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter the any decimal");
        Float A= SC.nextFloat();
        System.out.println("remove the total numbers from the decimal");
        int R= SC.nextInt();
        System.out.format("%."+R+"f",A);

    }
}
