package com.sda.javatallinn6.fundamentals.Classes;

public class PublicBicycleDemo {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle("myBike");
        Bicycle yourBike = new Bicycle("yourBike");
  //Shift+F6 - refactor>rename
        myBike.cadence = 2;
        myBike.speed = 20;
        myBike.gear = 2;

        yourBike.gear = 4;
        myBike.changeGear(5);
        yourBike.changeCadence(7);
        System.out.println("Gear of myBike is now "+myBike.gear);

        myBike.applyBrake(8);
        myBike.printStates();

        yourBike.printStates();
        System.out.println("Viide mäluaadressile: "+myBike);
        Person isik=new Person("Grete"); //saab kasutada!, sisaldub Bicycle2 klassis
        //isik.length(5); not AVAILABLE, it is out of package
        isik.setLength(6);

        Bicycle2 ratas=new Bicycle2("ÜksRatas", 6,7,8,"yellow");

        ratas.setColour("red");
        ratas.setSold(true);
        ratas.printStates();

        Bicycle2 veelYksRatas=new Bicycle2("VeelÜksRatas");
        veelYksRatas.printStates(); // int values are going to be not  null but default values=0; boolean default is false

    }



}
