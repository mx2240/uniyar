package com.example.javaprograms;

public class MyMultiplicationTable {

//    3. Function to print multiplication table
    public void printMultiplicationTable(int number) {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

