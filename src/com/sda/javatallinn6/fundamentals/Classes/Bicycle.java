package com.sda.javatallinn6.fundamentals.Classes;

import com.sda.javatallinn6.fundamentals.data.types.FloatingPointPrimitives;

public class Bicycle {
    String name;
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    String colour;
    public String accessibleVariable;
    protected FloatingPointPrimitives noh; //saab kasutada klassina oma loodud klasse
    //Ctrl+Space annab võimaliku andmetüübi

    //default constructor, no need to write it!
    public Bicycle(String name) {
        this.name=name;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrake(int decrement) {
        speed -= decrement;
    }

    void printStates() {
        System.out.println("Bicycle "+name+" has next properties:  cadence - " + cadence +
                ", gear - " + gear +
                ", speed - " + speed+".");
    }
}

