package com.sda.javatallinn6.fundamentals.Classes;

public class InstanceOf {


    public static void main(String[] args) {
        Bicycle first= new Bicycle("ratas");
        Bicycle2 second= new Bicycle2("veelyksratas");
        boolean result=first instanceof Bicycle; //oluine alamklasside määramisel
        Miski miskiRatas=new Miski("kolmekas");
        boolean result3=miskiRatas instanceof Bicycle;
        System.out.println("Miski on kah ratas: "+result3);
    }
    //boolean res2=second instanceof Bicycle; //kompilaator ei lase seda läbi

}
