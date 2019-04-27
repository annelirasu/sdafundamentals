package com.sda.javatallinn6.fundamentals.arrays;

public class ArraysHomework {
    /**
     * 1. I have an array like this :
     *          int[] firstArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
     *          int[] secondArray = { 0, 11, 13, 6}
     *
     *  Your duty is to find common elements in these two arrays and print them :)
     *
     *
     */

    public static void main(String[] args) {
        int[] firstArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        int[] secondArray = { 0, 11, 13, 6};
        int current=0;
        for(int i=0;i<firstArray.length;i++ ){
            current=firstArray[i];
            for (int j=0;j<secondArray.length;j++){
              //  System.out.print(secondArray[j]+" ");
                if(current==secondArray[j]){
                    System.out.println("Common in both arrays: "+current);
                    j=0;
                    break;
                }
            }
        }

    }
}
