package com.company;

import java.util.Scanner;

public class WhitespaceFormAString {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the any string");
        String S= Sc.nextLine();
        String A="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
            {
                A+=S.charAt(i);
            }
        }
        System.out.println(A);
    }
}
