package com.sda.javatallinn6.fundamentals.methods;

public class MethodExcamples {

    // write a method calculate sum of two numbers

    public int calculateSum(int firstNumber, int secondNumber){
        int result = firstNumber+secondNumber;
        return result;
    }

    // write a method gives the bigger number of two numbers

    public int findBiggerNumber(int number1, int number2){
        return number1 > number2 ? number1 : number2;
    }

    private void printVariables(int param1, double param2){
        System.out.println("param1:" +
                param1 + " param2:" +
                param2);
    }

    // write a method defines given year is a leap year or not
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
