package com.company;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
    int x = sc.nextInt();
        System.out.println("Enter The Second Number");
    int y = sc.nextInt();
        System.out.println("Enter The Third Number");

    int z = sc.nextInt();
        if (x>= y && x >= z)
            System.out.println(x + " is Largest Number");
        else if(y >= x && y >= z)
            System.out.println(y+ " is Largest Number");
        else
                System.out.println((z + " is Largest Number"));

}
}
