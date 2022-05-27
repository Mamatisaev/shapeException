package com.company;

public class Cylinder {
    private int height;
    private int radius;
    private final double PI = Math.PI;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        double areaOfCylinder = 2 * PI * radius * (height + radius);
        System.out.println("Area of this cylinder is " + areaOfCylinder + " cm.");
        return areaOfCylinder;
    }

    public double volume() {
        double volumeOfCylinder = (PI * radius * radius * height);
        System.out.println("Volume of this cylinder is " + volumeOfCylinder + " cm.");
        return volumeOfCylinder;
    }
}
