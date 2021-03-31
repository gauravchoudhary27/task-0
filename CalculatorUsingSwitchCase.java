package com.company;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the any two number");
        int first= Sc.nextInt(),second= Sc.nextInt();
        System.out.println("enter an any operator(+,-,*,/) ");
        char operator=Sc.next().charAt(0);
        double result = 0.0;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}






