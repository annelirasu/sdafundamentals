package com.sda.javatallinn6.fundamentals.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] arr1=new int[]{5,8,33};
        int[] arr1a=new int[5];//tühi, aga kolme kohaga
        String[] arr2=new String[]{"aaa","cccc","ddfs"};
        String[] arr2a=new String[4];//tühi aga nelja kohaga
        int j=55;
        for(int i=0; i<arr1a.length; i++)
        {
            arr1a[i]=j;
            j+=55;
        }

        for(int i=0; i<arr1a.length; i++)
        {
            System.out.println(arr1a[i]);
        }

        System.out.println("\n ======= \n");

        StringBuilder stb=new StringBuilder("bla");
        for(int i=0; i<arr2a.length; i++)
        {
            arr2a[i]=stb.toString();;
            stb.append("-bla");
        }
        for(int i=0; i<arr2a.length; i++)
        {
            System.out.println(arr2a[i]);
        }



    }

}
