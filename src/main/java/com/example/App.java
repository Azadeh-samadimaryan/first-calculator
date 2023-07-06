package com.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
   /*
   this method will print
   console-based calculator text to the console
    */

    // this is the main method not allow to change it
    public static void main(String[] args) {

        System.out.println("Following Operations Are Supported : \n" +
                "1. Addition (+) \n" +
                "2. Subtraction (-) \n" +
                "3. Multiplication (*) \n" +
                "4. Division (/) \n");

        System.out.println("Select a valid operation ");
        Scanner scanner=new Scanner(System.in);
        int operationNumber = scanner.nextInt();

        // if else or switch


    }
}