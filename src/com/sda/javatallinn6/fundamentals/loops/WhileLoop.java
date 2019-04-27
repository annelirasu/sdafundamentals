package com.sda.javatallinn6.fundamentals.loops;

public class WhileLoop {
    public static void main(String[] args) {

        int cnt = 1;
        while (cnt < 11) {
            System.out.println("Count is " + cnt);
            cnt++;
            if (cnt == 6) {
                System.out.println("Now continue!");
                continue;

            } else if (cnt == 8) {
                System.out.println("Now break!");
                break;
            }
            System.out.println("Count after ++ operation is " + cnt);


        }
//loop in loop
        int z = 0;
        while (z < 12) {
            System.out.println("z:" + z);
            z++;
            while (z >= 10) { // infinite loop
                System.out.println("z in second loop"+z);
                z+=2;
            }
            System.out.println("z: " + z);
        }

    }


}
