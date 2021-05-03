package exercises;

import java.util.Scanner;

public class NumericTypesMPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of miles you have driven: ");
        int miles = input.nextInt();
        System.out.println("What is the amount of gas (in gallons) that you have used: ");
        int gas = input.nextInt();
        int mpg = miles / gas;
        System.out.println("The miles-per-gallon is " + mpg);
    }
}


//    Write a program that asks a user for the number of miles they have driven and the amount of gas they’ve consumed (in gallons), and print their miles-per-gallon.