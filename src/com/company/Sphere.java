package com.company;

public class Sphere {
    private int radius;
    private final double PI = Math.PI;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        double areaOfSphere =  (4*PI*Math.pow(radius,2));
        System.out.println("Area of this Sphere is " + areaOfSphere + " cm.");
        return areaOfSphere;
    }

    public double volume() {
        double volumeOfSphere = (4/3*PI*Math.pow(radius,3));
        System.out.println("Volume of Sphere is " + volumeOfSphere + " cm.");
        return volumeOfSphere;
    }
}