package com.sda.javatallinn6.fundamentals;

public class Variables {
    int numOfStudents; //instance variable
    static int numOfTeachers;//static variable

    {
        int numOfCourses;//block variable, not reachable in main
    }
    public static void main(String[] args) {
        int numOfSchools;//local variable, usable only in Main
       //block local static instance

    }


}
