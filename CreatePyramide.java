package com.company;

import java.util.Scanner;

public class CreatePyramide {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = Sc.nextInt();

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        for (int i = noOfRows; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("* ");
            }

            System.out.println();

            rowCount++;
        }
    }
}


