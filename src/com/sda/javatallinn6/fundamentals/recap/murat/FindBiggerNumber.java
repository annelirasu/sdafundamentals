package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class FindBiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //muutujate nimed olgu arusaadavad, pigem pikad
        System.out.println("Welcome stranger. Please enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Welcome again, please enter another number:");
        int secondNumber = scanner.nextInt();
        System.out.print("You entered numbers " + firstNumber + " and " + secondNumber + ". ");
        if (firstNumber > secondNumber) {
            System.out.print(firstNumber + " is bigger than " + secondNumber+".");
        } else if (firstNumber == secondNumber) {
            System.out.print(firstNumber + " and " + secondNumber + " are equal.");
        } else {
            System.out.print(secondNumber + " is bigger than " + firstNumber+".");
        }
        scanner.close();
    }
}
