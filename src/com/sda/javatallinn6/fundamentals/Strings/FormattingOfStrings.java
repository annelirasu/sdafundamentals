package com.sda.javatallinn6.fundamentals.Strings;

public class FormattingOfStrings {
    public static void main(String[] args) {
        //System.out.print();
        //System.out.println();
        //System.out.printf();
        //System.out.format();

        System.out.printf("Hello %s!%n","World");// %s - another string argument, %n  -  new line
        System.out.printf("The  %s jumped over the %s,%d times %n","cow","moon",2);// %s - another string argument, %d  -  another digit argument
        System.out.printf("%b%n", true);// %b - boolean
        System.out.printf("%B%n", false); // %B - boolean in UpperCase
        System.out.printf("%B%n", false); // %B - boolean in UpperCase
    }
}
