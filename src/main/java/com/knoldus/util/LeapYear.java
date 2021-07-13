package com.knoldus.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeapYear {
    public static void main(String[] args){
        LocalDate republicDay= LocalDate.of(1950,1,26);
        int currentYear = LocalDate.now().getYear();
        int republicYear= republicDay.getYear();
        System.out.println("Leap Years after RepublicDay ");
        int count=0;
        for(int i=republicYear;i<=currentYear;i++) {
            if (i % 4 == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Count of Leap Years after RepublicDay "+ count);
    }
}
