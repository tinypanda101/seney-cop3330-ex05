/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");

        String firstNumber = scanner.nextLine();

        System.out.println("What is the second number?");

        String secondNumber = scanner.nextLine();

        int num1Int = Integer.parseInt(firstNumber);

        int num2Int = Integer.parseInt(secondNumber);

        int sum = num1Int + num2Int;

        int difference = num1Int - num2Int;

        int product = num1Int * num2Int;

        int quotient = num1Int / num2Int;

        System.out.println(num1Int + " + " + num2Int + " = " + sum + "\n" + num1Int + " - " + num2Int + " = " + difference
         + "\n" + num1Int + " * " + num2Int + " = " + product + "\n" + num1Int + " / " + num2Int + " = " + quotient);
    }
}