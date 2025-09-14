package com.icvm;

public class Person {
    String name;
    String age;

    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }
    public Person (Person s){
        this.name = s.name;
        this.age = s.age;
    }
}
