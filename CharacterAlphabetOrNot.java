package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CharacterAlphabetOrNot {
    public static void main(String[] args) {
        char c='@';
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println(c+"is alphabet");
        }
        else
        {
            System.out.println(c+"is not alphabet");
        }


    }
}
