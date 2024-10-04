package se.meteTurkan.diceGame;

import java.util.Random;
import java.util.Scanner;

public class Player {
    // Class attributes
    private int point = 0; // Player's total point
    private String playerName; // Player name can be decided by user

    // Creating scanner object
    private Scanner scanner;

    // Constructor to initialize the scanner object
    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    // Set functions
    public void setPoint(int point) {
        this.point += point;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName; // Set player name
    }

    public void setPointNull() {this.point = 0;} // Setting users point to Zero for each turn
    
    // Get functions
    public String getPlayerName() {
        return playerName;
    }

    public int getPoint() {
        return point;
    }

    // Creating random object
    Random random = new Random();

    // Each turn player actions
    public void playTurn() {
        System.out.printf("\n%s, it is your turn! Press 'Enter' to roll the dice...", getPlayerName());
        scanner.nextLine(); // Wait for user input
        int roll = random.nextInt(6) + 1; // What player rolls
        setPoint(roll); // Updating total point of player
        System.out.printf("%s rolled %d, Total points: %d%n\n", getPlayerName(), roll, getPoint());
    }
}
