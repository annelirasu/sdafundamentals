package com.sda.javatallinn6.fundamentals.loops;

public class ForLoop {
    public static void main(String[] args) {
        /**
         * This is format for explain your code! (JavaDoc)
         *
         * for(initialization; ending condition; operation){
         * statement
         * }
         */
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is " + i);
        }
        System.out.println();
        System.out.println("=====");
        System.out.println();


        for (int i = 10; i > 0; i--) {
            System.out.println("Count is " + i);
        }

        System.out.println();
        System.out.println("=====");
        System.out.println();

        //several initializations, and operations

        int ctr = 12;
        for (int j = 10, k = 4; j > k && ctr > 10; ++j, k = k - 1, ctr--) {
            System.out.println("j: " + j + ", k: " + k + ", ctr: " + ctr);

        }

        System.out.println();
        System.out.println("== Loop with continue ==");
        System.out.println();


        //loop with break and continue
        int num = 10;
        for (int i = 0; i < num; i++) {
            if (i > 5)
                continue; //not printing after i=5, jumping back to increment
            System.out.println("I is " + i);
        }
        System.out.println();
        System.out.println("== Loop with break ==");
        System.out.println();

        //loop with break
        num = 10;
        for (int i = 0; i < num; i++) {
            System.out.println("I is " + i);
            if (i >= 5) {
                System.out.println("Breaking now");
                break; //not printing after i=5, jumping back to increment
            }
        }

        System.out.println();
        System.out.println("== Inner and outer loop ==");
        System.out.println();

        for (int outer = 0; outer <= 10; outer++) {
            for (int inner = 0; inner <= 10; inner++) {
                System.out.println("Inner: " + inner + " outer: " + outer);
            }
        }

        // Exercise print out 11.28
        System.out.println();
        System.out.println("== Timetable ==");
        System.out.println();
        for (int hours = 0; hours <= 12; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hours < 10) {
                    System.out.print("0" + hours);
                    if (minutes < 10) {
                        System.out.print(":0" + minutes + "\n");

                    } else {
                        System.out.print(":" + minutes + "\n");
                    }

                } else {
                    System.out.print(hours);
                    if (minutes < 10) {
                        System.out.print(":0" + minutes + "\n");

                    } else {
                        System.out.print(":" + minutes + "\n");
                    }
                }
                if (hours == 11 && minutes == 28) break;
            }
        }

    }

}
