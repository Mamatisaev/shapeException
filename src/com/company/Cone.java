package com.company;

public class Cone {
    private int radius;
    private final double PI = Math.PI;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        double areaOfCone = PI * Math.pow(radius, 2);
        System.out.println("Area of this cone is " + areaOfCone + " cm.");
        return areaOfCone;
    }

    public double volume() {
        double volumeOfCone = ((height / 3) * PI * Math.pow(radius, 2));
        System.out.println("Volume of this cone is " + volumeOfCone + " cm.");
        return volumeOfCone;
    }
}