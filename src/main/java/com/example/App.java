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

        System.out.println("Enter an operator: (+ OR - OR * OR /) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();


    }
}