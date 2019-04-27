package com.sda.javatallinn6.fundamentals.Classes.statics;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike=new Bicycle("ratas_1",2,3,5,true,"blue");
        Bicycle bike2=new Bicycle("ratas_2",6,3,5,true,"yellow");
        Bicycle bike3=new Bicycle("ratas_3",2,9,5,true,"red");
        Bicycle bike4=new Bicycle("ratas_4",2,3,8,true,"black");
        bike.name="ratas_01"; //name on public
        System.out.println(Bicycle.count);//static variable belongs to the class not to object, here shows the number of created objects
        System.out.println(bike4.instanceCount);
        Bicycle.calculateSomething();//staatilise meetodi väljakutse tuleb klassiküljest
        System.out.println(Bicycle.TEMP_OF_BOILING_WATER);

    }
}
