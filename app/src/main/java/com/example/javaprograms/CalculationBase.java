package com.example.javaprograms;

import java.util.ArrayList;

// Parent Class
public class CalculationBase {

    // Function 1: Add two numbers
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // Function 5: Return square
    public int calculateSquare(int number) {
        return number * number;
    }

    // This method will be used to demonstrate Polymorphism (Method Overriding)
    public void displayType() {
        System.out.println("This is the Base Calculation Class.");
    }
}