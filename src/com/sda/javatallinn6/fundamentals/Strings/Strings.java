package com.sda.javatallinn6.fundamentals.Strings;

public class Strings {
    public static void main(String[] args) {
        String str1=new String("Paul");
        String str2=new String("Paul");

        System.out.println(str1==str2); //return false, because of different memory addresses

        char[] boy=new char[]{'P','a','u','l'};
        String aBoy=new String(boy);
        System.out.println(aBoy);
    }




}
