package com.sda.javatallinn6.fundamentals.methods;

public class MethodHomework {


    /**
     * 1. Write a method returns if person is older than 20 decides the person is adult or not
     * - Please call your method in main method with different input parameters and check
     * it gives expected results
     * <p>
     * 2. Write a method swap given two numbers and print what are the values before swapping and
     * after swapping.
     * - Please call your method in main method with different input parameters and
     * check it gives expected result
     * 3.
     */

    public static void main(String[] args) {
        isAdult(-10);
        isAdult(14);
        isAdult(21);
        isAdult(333);

        swapNumbers(4,7);

    }

    public static boolean isAdult(int Age) {
        if (Age <= 0) {
            System.out.println("Given age too low, person is not existing, try again.");
            return false;
        } else if (Age > 0 && Age < 19) {
            System.out.println(Age + " is not adult yet.");
            return false;
        } else if (Age >= 20 && Age < 115) {
            System.out.println(Age + " is adult.");
            return true;
        } else {
            System.out.println(Age+ " is too big number for human age.");
            return false;
        }
    }

    public static void swapNumbers(int nr1, int nr2){
        System.out.println("Given numbers are: "+nr1+" and "+nr2);
        System.out.println("Swaped version is: "+nr2+" and "+nr1);

    }


}
