package com.example.javaprograms;

public class Myloop {
    public void printArrayElements(int[] numbers) {
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line after printing the array
    }

}
