package se.meteTurkan.diceGame;

import java.util.Random;
import java.util.Scanner;

public class Player {
    // Class attributes
    private int point = 0; // Players total point
    private String playerName; // Player name can be decided by user


    // Set functions
    public void setPoint(int point) {
        this.point += point;
    }

    public void setPlayerName() {
        playerName = scanner.nextLine(); // Capturing the username
        this.playerName = playerName;
    }


    // Get functions
    public String getPlayerName() {
        return playerName;
    }

    public int getPoint() {
        return point;
    }


    // Creating objects
    Random random = new Random(); // Creating random object
    Scanner scanner = new Scanner(System.in); // Creating scanner object


    // Each turn player actions
    public void playTurn() {
        System.out.printf("\n%s, it is your turn! Press 'Enter' to dice the roll...", getPlayerName());
        scanner.nextLine(); // Wait for user input
        int roll = random.nextInt(6) + 1; // What player rolls
        setPoint(roll); // Updating total point of player
        System.out.printf("%s rolled %d, Total points: %d%n\n", getPlayerName(), roll, getPoint());
    }
}
