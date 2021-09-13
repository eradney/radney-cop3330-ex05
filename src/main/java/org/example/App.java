/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String num1, num2;
        int first, second, add, sub, mult, div;
        Scanner scnr = new Scanner(System.in);

        System.out.print("What is the first number? ");
        num1 = scnr.next();
        System.out.print("What is the second number? ");
        num2 = scnr.next();

        first = Integer.parseInt(num1);
        second = Integer.parseInt(num2);

        add = first + second;
        sub = first - second;
        mult = first * second;
        div = first / second;

        System.out.println(first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + sub);
        System.out.println(first + " x " + second + " = " + mult);
        System.out.println(first + " / " + second + " = " + div);
    }
}
