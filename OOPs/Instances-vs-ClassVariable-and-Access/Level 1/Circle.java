package com.icvm;

public class Circle {
    int radius;

    public Circle(int radius){
        if(radius<=0) System.out.println("Invalid");
        this.radius = radius;
    }

}
