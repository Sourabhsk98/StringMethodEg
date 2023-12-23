package com.StringMethodExample;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Using toString() method
        MyClassWithToString myObjectWithToString = new MyClassWithToString(userInput);
        String stringRepresentationWithToString = myObjectWithToString.toString();
        System.out.println("Using toString(): " + stringRepresentationWithToString);

        // Without using toString() method
        MyClassWithoutToString myObjectWithoutToString = new MyClassWithoutToString(userInput);
        String stringRepresentationWithoutToString = Integer.toString(myObjectWithoutToString.getNumber());
        System.out.println("Without using toString(): " + stringRepresentationWithoutToString);
    }
}

class MyClassWithToString {
    private int number;

    public MyClassWithToString(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}

class MyClassWithoutToString {
    private int number;

    public MyClassWithoutToString(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}