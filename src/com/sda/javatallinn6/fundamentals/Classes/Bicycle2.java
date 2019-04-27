package com.sda.javatallinn6.fundamentals.Classes;

public class Bicycle2 {
    //access key-words:
    //*public - accessible to everyone
    //*protected
    //*default
    //*private
    //*final
    private final String name;
    private int cadence;
    private int speed;
    private int gear;
    private boolean isSold;
    private String colour;

    //kui juba on üks parameetritega konstruktor loodud, siis enam ei saa kasutada tühja default parameetriteta konstruktorit
    public Bicycle2(String name) {
        this.name = name;
    }


    public Bicycle2(String name, int cadence, int speed, int gear, String colour) {
        this.name = name;//set once and forever because of Final
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
        this.colour = colour;
    }


    public String getName() {
        return name;
    }


    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Bicycle " + name + " has next properties:  cadence is " + cadence +
                ", gear is " + gear +
                ", speed is " + speed +
                ", colour is " + colour +
                " and if it is sold: "+isSold+".");
    }

    //package availability for class Person is here!
    public static void main(String[] args) {
        Person n = new Person("");
    }
}

class Person { //siia ei või enam public kirjutada, sest ühes java failis võib ainult üks public klass olla
    //see on kättesaadav Package ja klassi piires (ilma keywordita muutuja nt), aga pole kättesaadav alamklassile
    private String name;
    public double length;

    public Person(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
