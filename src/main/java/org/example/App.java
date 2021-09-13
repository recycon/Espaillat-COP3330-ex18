package org.example;

import java.util.Scanner;

/**
 * Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.
 *
 *
 * Press C to convert from Fahrenheit to Celsius.
 * Press F to convert from Celsius to Fahrenheit.
 * Your choice: C
 * Please enter the temperature in Fahrenheit: 32
 * The temperature in Celsius is 0.
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        String temp;
        int tempNum;
        System.out.println( "Press C to convert from Fahrenheit to Celsius.\n"+
        "Press F to convert from Celsius to Fahrenheit." );
        temp=in.next();
        System.out.println( "Your choice: "+temp.toUpperCase());

        System.out.print( "Please enter the temperature in Fahrenheit:" );
        tempNum= in.nextInt();
        if(temp.equals("C")||temp.equals("c")) {
            int C;
            C = (tempNum -32) *5 / 9;
            System.out.println( "The temperature in Celsius is "+C+"." );
        }
        else if(temp.equals("F")||temp.equals("f")) {
            int F = (tempNum * 9 / 5) + 32;
            System.out.println( "The temperature in Fahrenheit is "+F+"." );
        }
    }
}
