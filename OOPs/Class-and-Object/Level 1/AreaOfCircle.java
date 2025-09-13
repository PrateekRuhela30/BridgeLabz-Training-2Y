package com.gla;

public class AreaOfCircle {

    int radius;
    public AreaOfCircle(int radius) {
        this.radius = radius;
    }
    public void areaCircle() {
        float area = (float) (3.14*radius);
        float circum = (float) (2*3.14*radius);
        System.out.println("Area of circle : " + area);
        System.out.println("Area of circumference : " + circum);
    }
}