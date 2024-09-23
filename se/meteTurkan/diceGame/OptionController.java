package se.meteTurkan.diceGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionController {

    public int checker() {
        Scanner  myInput = new Scanner(System.in); // Creating scanner object
        int userInput = -1;

        // Checking if user inputted valid value
        do {
            try {
                System.out.println("Choice:\t"); // Prompt user to input
                userInput = myInput.nextInt(); // Read user input

                if (userInput == 1 || userInput == 2) { // Check if input is within range
                    break; // Exit loop if valid input
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2"); // Print error message
                }
            } catch (InputMismatchException e) { // Catch block to handle InputMismatchException
                System.out.println("Invalid input. Please enter integer 1 or 2"); // Print error message
                myInput.next(); // Clear the invalid input from the scanner
            }
        } while (true); // Continue loop indefinitely until valid input

        return userInput; // Return user choice
    }
}


