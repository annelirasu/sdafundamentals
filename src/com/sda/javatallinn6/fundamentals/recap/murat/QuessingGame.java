package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class QuessingGame {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome stranger. Please enter your full name:");
        String answer=scan.nextLine();
        if(answer.equalsIgnoreCase("james bond")){
            System.out.println("Welcome 007!");
        }else {
            System.out.println("Get out, you are not an agent!");
        }

    }
}
