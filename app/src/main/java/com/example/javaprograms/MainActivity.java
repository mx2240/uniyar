package com.example.javaprograms;

import android.os.Bundle;
import android.widget.TextView; // Import TextView
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the TextView from the XML
        TextView resultView = findViewById(R.id.resultTextView);
        StringBuilder output = new StringBuilder();

        // Initialize Helper (Inheritance & Polymorphism)
        MathHelper helper = new MathHelper();

        // 1. Addition
        int sum = helper.addTwoNumbers(10, 5);
        output.append("1. Sum (10+5): ").append(sum).append("\n\n");

        // 2. Even/Odd
        output.append("2. ").append(helper.checkEvenOrOdd(7)).append("\n\n");

        // 3. Multiplication Table (Function to return string/print)
        output.append("3. Multiplication Table (5):\n");
        for (int i = 1; i <= 10; i++) {
            output.append("5 x ").append(i).append(" = ").append(5 * i).append("\n");
        }
        output.append("\n");

        // 4. Collection (ArrayList)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); numbers.add(20); numbers.add(30);
        output.append("4. ArrayList Elements: ").append(numbers.toString()).append("\n\n");

        // 5. Square
        output.append("5. Square of 4: ").append(helper.calculateSquare(4));

        // Display everything on the screen
        resultView.setText(output.toString());
    }
}