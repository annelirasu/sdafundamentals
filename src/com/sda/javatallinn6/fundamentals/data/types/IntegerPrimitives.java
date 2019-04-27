package com.sda.javatallinn6.fundamentals.data.types;

public class IntegerPrimitives {
    public static void main(String[] args) {
        int myFirstLiteral = 5; //Format Ctrl+ Alt+ L
        int x = 3;
        System.out.println(myFirstLiteral);
        System.out.println(x);
        System.out.println("My first integer: "+myFirstLiteral+" and my second integer: "+x+".");
        int maxInt= Integer.MAX_VALUE; //overflow and goes to the start - smallest
        int minInt= Integer.MIN_VALUE;
        int overLoadedInt=maxInt+3;
        int overLoadedIntMin=minInt-3;
        long useLongNow=(long)maxInt+3l;
        System.out.println("Maximum integer is "+ maxInt+" and overloaded maximum is "+overLoadedInt +"if added 3 and minimum is "+minInt+ " and overloaded minimum is "+overLoadedIntMin);
        System.out.println("And long is now "+useLongNow);
        int intWithUnderScore=24_888_098;
        System.out.println("Java 8 allows to write integers with underscore  -  written 24_888_098 = "+intWithUnderScore);

        //NB! Datatype means range!
    }
}
