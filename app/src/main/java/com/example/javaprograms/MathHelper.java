package com.example.javaprograms;

import java.util.ArrayList;

// Inheritance: MathHelper inherits from CalculationBase
public class MathHelper extends CalculationBase {

    // Function 2: Check Even or Odd
    public String checkEvenOrOdd(int number) {
        return (number % 2 == 0) ? number + " is Even" : number + " is Odd";
    }

    // Function 3: Print Multiplication Table
    public void printMultiplicationTable(int number) {
        System.out.println("Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Function 4: Collection (ArrayList) loop and print
    public void printListElements(ArrayList<Integer> numbers) {
        System.out.print("ArrayList Elements: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Polymorphism: Overriding the parent method
    @Override
    public void displayType() {
        System.out.println("This is the Advanced MathHelper Class (Polymorphism).");
    }
}