package com.knoldus.util;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//        Assignment 3.
//        Print the number of seconds a man lived(ignore time, consider only date). Create a function which takes two parameters
//        Man’s birth date.
//        Man's death date.
public class Lived {
    public static void main(String[] args) {
            System.out.println("Please enter your birthday:");
            Scanner sc = new Scanner(System.in);
            String birth= sc.next();
            System.out.println("Please enter your deathday: ");
            String death= sc.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate birthDate = LocalDate.parse(birth,formatter);
                LocalDate deathDate = LocalDate.parse(death,formatter);
                System.out.println("You lived "+ ChronoUnit.SECONDS.between(deathDate,birthDate));

    }
}
