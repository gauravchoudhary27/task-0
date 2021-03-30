package com.company;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the any string");
        String S=Sc.nextLine();
        System.out.println("write the string character");

        char C=Sc.next().charAt(0);
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==C)

                count++;


        }

        System.out.println(C+"frequency of character"+ count);



    }
}
