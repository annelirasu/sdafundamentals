package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class PrintOutCharArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome stranger. Please enter a name.");
        String name = scan.nextLine();
        System.out.println(name.replaceAll(""," "));
    }
}
