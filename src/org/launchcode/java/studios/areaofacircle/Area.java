package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius;
//        double radius = keyboard.nextDouble(); // Commenting out for validation
        boolean firstRun = true; // Adding in for validation
        do {
            if (!firstRun) {
                System.out.println("That number is invalid.");
            }
//            System.out.print("Enter a number in the " + "range of 1 through 100: ");
            radius = keyboard.nextDouble();
            firstRun = false;
        } while (radius < 1 || radius > 100);
        keyboard.close();
//        double area = Math.PI * (radius * radius);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}



