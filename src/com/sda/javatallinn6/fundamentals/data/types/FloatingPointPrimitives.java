package com.sda.javatallinn6.fundamentals.data.types;

public class FloatingPointPrimitives {
    public static void main(String[] args) {
        float firstFloat=123.4f;
        float maxFloat=Float.MAX_VALUE;
        float minFloat=Float.MIN_EXPONENT;
        System.out.println(" Min float exponent: "+minFloat+" and max float: "+maxFloat);

        double firstD=1234; //goes in range of integer
        double secondD=12345566d;
        double thirdD=123.856295d;
        double withED=123.8764e7d;
        double maxDobule=Double.MAX_VALUE;
        System.out.println("Just double:"+thirdD);
        System.out.println("Double with e: 123.8764e7d = "+withED); //e * 10 astendajaga
        System.out.println("Max double "+maxDobule);

    }



}
