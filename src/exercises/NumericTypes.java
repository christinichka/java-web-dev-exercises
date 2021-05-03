package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("What is the width of the rectangle: ");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}


//Write a program to calculate the area of a rectangle and print the answer to the console. You should prompt the user for the dimensions. (What data types should the dimensions be?)