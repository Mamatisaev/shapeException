package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {

            System.out.println("Enter the shape: ");

            Scanner scanner1 = new Scanner(System.in);
            String shape = scanner1.nextLine();

            switch (shape) {

                case ("parallelepiped"):

                    Scanner scanner2 = new Scanner(System.in);
                    try {
                        System.out.println("Enter the length: ");
                        int length = scanner2.nextInt();
                        if (length < 0) {
                            throw new MyException("Length of this parallelepiped should be positive number.");
                        }
                        if (length > 20) {
                            throw new MyException("Length of this parallelepiped should be less than 20.");
                        }

                        System.out.println("Enter the width: ");
                        int width = scanner2.nextInt();
                        if (width < 0) {
                            throw new MyException("Width of this parallelepiped should be positive number.");
                        }
                        if (width > 20) {
                            throw new MyException("Width of this parallelepiped should be less than 20.");
                        }

                        System.out.println("Enter the height: ");
                        int height = scanner2.nextInt();
                        if (height < 0) {
                            throw new MyException("Height of this parallelepiped should be positive number.");
                        }
                        if (height > 20) {
                            throw new MyException("Height of this parallelepiped should be less than 20.");
                        }

                        Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                        parallelepiped.area();
                        parallelepiped.volume();

                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());

                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("You should enter numbers.");
                    }
                    break;

                case ("cylinder"):

                    Scanner scanner3 = new Scanner(System.in);
                    try {
                        System.out.println("Enter the height: ");
                        int height = scanner3.nextInt();
                        if (height < 0) {
                            throw new MyException("Height of this cylinder should be positive number.");
                        }
                        if (height > 20) {
                            throw new MyException("Height of this cylinder should be less than 20.");
                        }

                        System.out.println("Enter the radius: ");
                        int radius = scanner3.nextInt();
                        if (radius < 0) {
                            throw new MyException("Radius of this cylinder should be positive number.");
                        }
                        if (radius > 20) {
                            throw new MyException("Radius of this cylinder should be less than 20.");
                        }

                        Cylinder cylinder = new Cylinder(height, radius);
                        cylinder.area();
                        cylinder.volume();

                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());

                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("You should enter numbers.");
                    }
                    break;

                case ("cone"):

                    Scanner scanner4 = new Scanner(System.in);
                    try {
                        System.out.println("Enter the radius: ");
                        int radius = scanner4.nextInt();
                        if (radius < 0) {
                            throw new MyException("Radius of this cone should be positive number.");
                        }
                        if (radius > 20) {
                            throw new MyException("Radius of this cone should be less than 20.");
                        }

                        System.out.println("Enter the height: ");
                        int height = scanner4.nextInt();
                        if (height < 0) {
                            throw new MyException("Height of this cone should be positive number.");
                        }
                        if (height > 20) {
                            throw new MyException("Height of this cone should be less than 20.");
                        }

                        Cone cone = new Cone(radius, height);
                        cone.area();
                        cone.volume();

                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());

                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("You should enter numbers.");
                    }
                    break;

                case ("sphere"):

                    Scanner scanner5 = new Scanner(System.in);
                    try {
                        System.out.println("Enter the radius: ");
                        int radius = scanner5.nextInt();
                        if (radius < 0) {
                            throw new MyException("Radius of this sphere should be positive number.");
                        }
                        if (radius > 20) {
                            throw new MyException("Radius of this sphere should be less than 20.");
                        }

                        Sphere sphere = new Sphere(radius);
                        sphere.area();
                        sphere.volume();

                    } catch (MyException myException) {
                        System.out.println(myException.getMessage());

                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("You should enter numbers.");
                    }
                    break;

                default:
                    System.out.println("There is no such a shape in our list.");
            }
        }
    }
}