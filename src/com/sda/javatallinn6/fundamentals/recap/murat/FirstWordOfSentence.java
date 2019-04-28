package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class FirstWordOfSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please enter a sentence. Enter \"done\" for exit the program :");
        String sentence=scanner.nextLine();
        while(true) {
            if (sentence.equalsIgnoreCase("done")) {
                System.exit(0); //break asemel
            } else {
                String[] words=sentence.split(" ");
                System.out.println(words[0]);
                for(int i=1;i<words.length;i++) {
                    if (words[i].trim().equalsIgnoreCase("done")) {
                        System.exit(0);
                    }
                }
                System.out.println("Please enter another sentence or enter \"done\" for exit the program :");
                sentence=scanner.nextLine();
            }

        }


    }

}
