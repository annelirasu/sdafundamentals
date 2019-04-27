package com.sda.javatallinn6.fundamentals.Strings;

import java.util.Arrays;

public class StringExercises {
    public static void main(String[] args) {

        isAnagram("Kana","Kaan");
        isAnagram("Muna","Mauno");
        isAnagram("Majakas","ajakasm");
        isAnagram("kurru-nurru","ururkrnuur-");
        isAnagram("ajamaja","vikerkaar");
        isPalindrome("redivider");
        isPalindrome2("aiassadassaia");
        isPalindrome("kamarajura");

    }

    private static boolean isAnagram(String first, String second) {
        String firstSorted=sort(first);
        String secondSorted=sort(second);
        boolean isAnagram=firstSorted.equals(secondSorted);
        System.out.println(first + " is angaram of "+ second+"? "+isAnagram);
        return isAnagram;

    }

    private static String prepare(String text) {
        return text.toLowerCase()
                .trim()//Returns a copy of the string, with leading and trailing whitespace omitted.
                .replaceAll("\\s+","");//\\s+ replace all spaces

    }

    private static String sort(String text){
        char[] chars=prepare(text).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static boolean isPalindrome(String s){
        String reversed=reverse(s);
        boolean isPalindrome=s.equals(reversed);
        System.out.println(s + " is palindrome ? "+isPalindrome);
        return isPalindrome;

    }

    private static boolean isPalindrome2(String text){
        StringBuilder reversed=new StringBuilder();
        String clean=text.toLowerCase()
                .trim()//Returns a copy of the string, with leading and trailing whitespace omitted.
                .replaceAll("\\s+","");//\\s+ replace all spaces
        char[] plain=clean.toCharArray();
        for (int i=plain.length-1;i>=0;i--){
            reversed.append(plain[i]);
        }
        boolean isPalindrome=text.equals(reversed);
        System.out.println(text + " is palindrome ? "+isPalindrome);
        return isPalindrome;

    }

    private static String reverse(String text){
        return new StringBuilder(text).reverse().toString();
    }
}
