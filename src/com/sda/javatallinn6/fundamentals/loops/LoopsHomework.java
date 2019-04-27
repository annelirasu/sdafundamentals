package com.sda.javatallinn6.fundamentals.loops;

public class LoopsHomework {
    /**
     *
     *     *******
     *     ******
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 1. Write a method prints stars like above
     * 2. Write a method to calculate the sum of first 10 natural number.
     * 3. Write a method to calculate factorial number of given input!
     *
     */
    public static void main(String[] args) {
        printLessAndLessStars(7);
        sumOfFirstNaturalNumbers(10);
        factorialOfTheNumber(10);
    }

    public static void printLessAndLessStars(int NumberOfStarsInStartingRow){
        if(NumberOfStarsInStartingRow<=0){
            NumberOfStarsInStartingRow=Math.abs(NumberOfStarsInStartingRow);
        }
        for(int col=NumberOfStarsInStartingRow; col>0;col--){
            for(int row=col;row>0;row--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sumOfFirstNaturalNumbers(int number){
        int sum=0;
        for(int i=1; i<=number;i++){
            sum+=i;

        }
        System.out.println("The sum of the first "+number+" natural numbers is "+sum);
        return sum;
    }

    public static int factorialOfTheNumber(int number){
        int fac=1;
        for(int i=1; i<=number;i++){
            fac*=i;

        }
        System.out.println("The sum of the first "+number+" natural numbers is "+fac);
        return fac;
    }
}
