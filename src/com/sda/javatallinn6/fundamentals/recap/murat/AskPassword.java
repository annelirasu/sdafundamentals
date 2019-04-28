package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class AskPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //muutujate nimed olgu arusaadavad, pigem pikad
        String password1 = "Kukeleegu28";
        String password2 = "Kanajalad66";

        System.out.println("Welcome stranger. Please enter the password:");
        String enteredPassword1 = scanner.nextLine();
        if (compareTwoStrings(password1, enteredPassword1)) {
            System.out.println("Great. Please enter the second password:");
            String enteredPassword2 = scanner.nextLine();
            if (compareTwoStrings(password2, enteredPassword2)) {
                System.out.println("Welcome to the club!");
            } else {
                System.out.println("Second password was wrong.");
            }
        } else {
            System.out.println("Sorry, first password was wrong.");
        }
    }

    public static boolean compareTwoStrings(String first, String second) {
        char[] lettersOfFirst = first.toCharArray();
        char[] lettersOfSecond = second.toCharArray();
        if (lettersOfFirst.length != lettersOfSecond.length) {
            return false;
        } else {
            for (int i = 0; i < lettersOfFirst.length; i++) {
                if (lettersOfFirst[i] != lettersOfSecond[i]) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
