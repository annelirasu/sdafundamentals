package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, please enter a number to find it's factorial:");
        Long enteredNumber = Long.valueOf(scanner.nextInt());
        boolean isContinuing = true;
        while (isContinuing) {
            if (enteredNumber == -1) {
                isContinuing=false;
                break;
            } else if (enteredNumber < -1) {
                System.out.println("Entered number should not be negative. ");
            } else if (enteredNumber == 0) {
                System.out.println("0!=1");
            } else {
                long factorial = 1l;
                System.out.print(enteredNumber + "! = ");
                for (Long i = enteredNumber; i > 1; i--) {
                    factorial *= i;
                    System.out.print(i + "*");
                }
                System.out.print("1 = " + factorial+"\n");
            }
            System.out.println("Enter another number: ");
            enteredNumber=scanner.nextLong();
        }
    }
}
