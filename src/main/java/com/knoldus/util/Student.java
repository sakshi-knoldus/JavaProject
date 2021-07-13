package com.knoldus.util;

import java.util.ArrayList;
import java.util.List;

public class Student {
   public int id;
   public String name;
   public int age;
   public Address address;
   public Student(int id,String name,int age,Address address){
       this.name = name;
       this.id=id;
       this.age = age;
       this.address = address;
   }
    public String toString() {
        return "Student Id: " + this.id +
                ", Student Name: " + this.name+", Student age: " + this.age+
                ", Student Primary Adress: " + this.address.getPrimaryAddress();
    }
}
class Address{
    private final String primaryAddress;
    private  String secondaryAddress;
    public Address(String primaryAddress,String secondaryAddress){
        this.primaryAddress=primaryAddress;
        this.secondaryAddress=secondaryAddress;
    }
    Address(String primaryAddress){
        this.primaryAddress=primaryAddress;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

}

class Main{
    public static void main(String[] args) {
        Student std1 = new Student(1,"Sakshi",21,new Address("Ganga Nagar"));
        Student std2 = new Student(2,"Emp",23,new Address("Parijat Colony","Defence Colony"));
        Student std3 = new Student(3,"Sak",21,new Address("Ganga Nagar","Radha Garden"));
        Student[] arr= {std1,std2,std3};
        List<Object> result=new ArrayList<Object>() ;
        for(Student std:arr){
           if( std.address.getSecondaryAddress()==null&& std.name.startsWith("S")){
               result.add(std);
               System.out.println("Added the student id to the result list "+std.id);
           }
        }

        for(Object std:result){
            System.out.println(std);
        }


    }
}


//        Assignment 1.
//        Create a class Student: id(int), name(String), age(int), address(Address)
//        Address Object: Primary Address - String Secondary Address - Optional
//        A student can or cannot have a secondary address.
//        Find the list of students associated who do not have a secondary address.
//        Find the list of student name where the name starts with the initial of your name and
//        do not have a secondary address.
//

//        Assignment 4.
//         List all the leap years after 1st Republic Day(India).
//
