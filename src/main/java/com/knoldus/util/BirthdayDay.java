package com.knoldus.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//         Assignment 2.
//        List all your birth date’s DayOfWeek till date.
public class BirthdayDay {
    public static void main(String[] args) {
        System.out.println("Please enter your birthday:");
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthdate= LocalDate.parse(input,format);
        LocalDate currentDate= LocalDate.now();
        int cntOfYear= currentDate.getYear() - birthdate.getYear();
        for(int i=0;i<cntOfYear;i++){
            birthdate = birthdate.plus(1, ChronoUnit.YEARS);
            System.out.println(input.substring(0,6)+birthdate.getYear()+" " +birthdate.getDayOfWeek());
        }
    }
}
