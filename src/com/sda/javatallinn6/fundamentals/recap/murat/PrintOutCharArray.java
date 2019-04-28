package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class PrintOutCharArray { //sõrendatud tekst
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome stranger. Please enter a name.");
        String name = scan.nextLine();
        System.out.println(name.replaceAll(""," "));

        System.out.print("Name printed out as charArray: ");
        char[] letters=name.toCharArray();
        for (int i=0; i<letters.length; i++){
            System.out.print(letters[i]+" ");
        }
    }
}
