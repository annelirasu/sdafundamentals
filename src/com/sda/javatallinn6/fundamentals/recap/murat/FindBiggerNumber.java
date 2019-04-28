package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class FindBiggerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome stranger. Please enter a number:");
        int first = scan.nextInt();
        System.out.println("Welcome again, please enter another number:");
        int second = scan.nextInt();
        System.out.print("You entered numbers " + first + " and " + second + ". ");
        if (first > second) {
            System.out.print(first + " is bigger than " + second+".");
        } else if (first == second) {
            System.out.print(first + " and " + second + " are equal.");
        } else {
            System.out.print(second + " is bigger than " + first+".");
        }
        scan.close();
    }
}
