package com.sda.javatallinn6.fundamentals.recap.murat;

import java.util.Scanner;

public class HowManyChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please write a string:");
        String sentence = (scanner.nextLine()).replaceAll(" ","");
        System.out.println("Please, write the char to search occurances in the string: ");
        char aChar=(scanner.nextLine()).charAt(0);
        char[] charsOfSentence=sentence.toCharArray();
        int counter=0;
        for(int i=0; i<charsOfSentence.length;i++){
            if(charsOfSentence[i]==aChar){
                ++counter;
            }
        }
        System.out.println("Result: "+counter);
    }
}
