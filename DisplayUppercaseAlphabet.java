package com.company;

import java.util.Scanner;

public class DisplayUppercaseAlphabet {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("upper case alphabet are");
        char c;
        for(c='A';c<='Z';++c)
        {
            System.out.print(c+ " ");
        }
    }
}
