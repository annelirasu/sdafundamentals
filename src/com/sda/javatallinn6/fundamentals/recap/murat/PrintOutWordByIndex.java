package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class PrintOutWordByIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Murat! Please enter a sentence. Enter only \"done\" for exit the program:");
        String sentence = scanner.nextLine();
        if (sentence.equalsIgnoreCase("done")) System.exit(0);

        System.out.println("Pease enter an order number of a word in sentence: ");
        int indexOfWord = scanner.nextInt() - 1;
        while (true) {

            String[] words = sentence.split("\\s+");
            if (indexOfWord > words.length - 1) {
                System.out.println("Sentences doesn't have so much words");
            }
     else {
                System.out.println(words[indexOfWord]);
            }
               /*        for (int i = 0; i < words.length; i++) {
                    if (words[i].trim().equalsIgnoreCase("done")) {
                        System.exit(0);
                    }
                }
            }*/
            System.out.println("Please enter another sentence or enter \"done\" for exit the program :");
            scanner.nextLine();
            sentence = scanner.nextLine();
            if (sentence.equalsIgnoreCase("done")) System.exit(0);
            System.out.println("Pease enter an index number of a word in sentence: ");
            indexOfWord = scanner.nextInt()-1;
        }
    }
}
