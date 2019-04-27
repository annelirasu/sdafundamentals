package com.sda.javatallinn6.fundamentals.data.types;

public class BooleanPrimitives {
    public static void main(String[] args) {
        boolean right = true;
        boolean wrong = false;

        System.out.println("Am I always true? " + wrong);
        System.out.println("Am I sometimes wrong? " + true);

        boolean isStudent = true;
        if(isStudent){
            System.out.println("Yes, I am a student");
        }else{
            System.out.println("No, I am not a student.");
        }

        double tomatoKG=1.2;

        double tomatoPrice=0.95;
        System.out.println("I bought "+ tomatoKG+" kg tomato with the price "+tomatoPrice+" for tomato kg.");

        double paidPrice=tomatoKG*tomatoPrice;
        int integerPartOfPrice=(int)paidPrice;
        int centPartOfPrice=(int)Math.round((paidPrice-integerPartOfPrice)*100);
        char currency ='\u20AC';
        System.out.println("I paid "+integerPartOfPrice+currency+" and "+centPartOfPrice+" cents in total. ("+paidPrice+").");
    }
}
