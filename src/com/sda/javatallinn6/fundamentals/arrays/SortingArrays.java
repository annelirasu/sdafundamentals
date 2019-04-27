package com.sda.javatallinn6.fundamentals.arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int[] numbers=new int[]{-1,4,7,22,-34,87,24};
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +", ");
        }
        java.util.Arrays.sort(numbers);
        System.out.println();
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +", ");
        }

    }


}
