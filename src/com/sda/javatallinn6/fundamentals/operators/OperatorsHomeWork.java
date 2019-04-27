package com.sda.javatallinn6.fundamentals.operators;

public class OperatorsHomeWork {
    public static void main(String[] args) {
        // 1. Try to evaluate the a value after each step then find the final result!
        int a = 10;

        a = ++a + a + --a - --a + a++;
        int b=10;
        System.out.println("11 + 11 = 22, a=11 :"+(++b + b)); //õige
        b=10;
        System.out.println("22+(11-1) = 32, a=10 :"+(++b + b+ --b));//peab tulema 32
        b=10;
        System.out.println("32-(10-1)=23, a=9 :"+(++b + b+ --b - --b)); //õige
        b=10;
        System.out.println("23 +9 = 32 : "+ (++b + b+ --b - --b+ b++));//where is going to be the last++?
        //he postfix version (result++) evaluates to the original value. If you are just performing a simple increment/decrement, it doesn't
        // really matter which version you choose.
        // But if you use this operator in part of a larger expression,
        // the one that you choose may make a significant difference.

        System.out.println("Real answer: "+a);

        System.out.println("--------------------");

        // 2. Try to understand the difference the expressions below:

        int a1 = 10;
        int b1 = 20;
        System.out.println("Should print 20, b1 value is assigned now to a1");
        System.out.println(a1=b1); // what it prints? try to guess without running the main method
        System.out.println("Should print true, b1 value is assigned  to a1 and they are equal.");
        System.out.println(a1 == b1); // what it prints? try to guess without running the main method

        System.out.println("--------------------");
        // 3. try to understand what the expression below prints without running the main method

        int marks = 8;
        int total = 10;

        System.out.println("Should print (false and true) is false");
        System.out.println(total<marks  && ++marks>5);//here only temporary unary operation, no ;
        System.out.println("Should print 8+1=9, but no , because it was only temporary unary operation, no ; mark in the end;");
        System.out.println(marks);//turn back to original?
        System.out.println("Should print true or true is true");
        System.out.println(total == 10 || ++marks>5);
        System.out.println("Should print again 8");
        System.out.println(marks);
        //double && and double|| evaluates actually only left side, if it is enough for deciding

    }

}
