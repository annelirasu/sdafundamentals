package com.sda.javatallinn6.fundamentals.data.types;

public class LongPrimitive {
    public static void main(String[] args) {
        long maxLong=Long.MAX_VALUE;
        long minValue=Long.MIN_VALUE;
        long justALong=4652l;
        long maxLongOnceMore=9223372036854775807L;// put L in the end for sure

        System.out.println("Max long " + maxLong);
        System.out.println("Min long " + minValue);

        System.out.println("Assigning a long you should rememeber to write a l to the very end: 4652l = "+justALong);
    }
}
