package com.company;

import java.util.Scanner;

public class AsciiValueofCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char x= sc.next().charAt(0);
        System.out.println("Ascii of of char ");
        int y = x;
        System.out.println(y);
    }
}
