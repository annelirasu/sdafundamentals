package com.sda.javatallinn6.fundamentals;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;

public class DateTime {
    //USE Joda-Time!!!
    public static void main(String[] args)throws ParseException {
        Calendar cal=Calendar.getInstance();
        System.out.println("Current date: "+ cal.getTime());

        System.out.println("Year: "+cal.get(Calendar.YEAR));
        System.out.println("Month: "+cal.get(Calendar.MONTH));
        System.out.println("Day: "+cal.get(Calendar.DATE));
        cal.add(Calendar.DATE,-10);
        System.out.println("10 days ago was "+cal.getTime());

        cal.add(Calendar.MONTH,2);
        System.out.println("... two months in future from that is  "+cal.getTime());

        cal.add(Calendar.YEAR,-1);
        System.out.println("... and then 1 year ago "+cal.getTime());

        LocalDate currentTime=LocalDate.now();

    }
}
