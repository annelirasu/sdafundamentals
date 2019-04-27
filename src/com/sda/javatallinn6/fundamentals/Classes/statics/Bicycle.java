package com.sda.javatallinn6.fundamentals.Classes.statics;

public class Bicycle {


    //this is about "static" keyword
    public  String name;
    private int cadence; //instance variables
    private int speed;//instance variables
    private int gear;
    private boolean isSold;
    private String colour;
    static int count=0;//class variable, no access modifier (public, protected, private), therefore visible inside of package (in class BicycleDemo)
    int instanceCount;//instance variables

    public static final double PI=3.141592; //final is forever
    public static final int TEMP_OF_BOILING_WATER=100; //final is forever

    public Bicycle(String name, int cadence, int speed, int gear, boolean isSold, String colour) {
        this.name = name;
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
        this.isSold = isSold;
        this.colour = colour;
        count++;
        instanceCount++;
    }

    public static void calculateSomething(){
        System.out.println("I am a static method");
    }
}
