package com.sda.javatallinn6.fundamentals.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        // CONDITIONAL OPERATOR
        // ? :
        // In other word : ternary

        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        // if some condition is true then value1 else value2
        result = someCondition ? value1 : value2;

        System.out.println(result);
        int anotherResult;
        // same as above
        if(someCondition){
            anotherResult = value1;
        }else{
            anotherResult = value2;
        }
        System.out.println(anotherResult);

        //find the biggest number among two numbers

        int result2 = value1>value2 ? value1 : value2;

        int value3 = 3 ;

        // find the biggest in 3 numbers

        int result3=value1>value3 ? value1 :value3;
        int result4=value2>value3 ? value2: value3;
        int result5=result3>result4 ?result3 :result4;
        System.out.println("The biggest nr from 3 is: "+result5);


        // homework
        // CONDITIONAL OPERATOR
    }
}
