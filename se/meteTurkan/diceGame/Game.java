package se.meteTurkan.diceGame;

import java.util.Scanner;

public class Game {
    // Creating player objects
    Scanner scanner = new Scanner(System.in);
    Player playerOne = new Player(scanner);
    Player playerTwo = new Player(scanner);

    public void init() {
        // Prompting player 1 to input their name
        System.out.print("Player-1, please enter your name: ");
        playerOne.setPlayerName(scanner.nextLine());

        // Prompting player 2 to input their name
        System.out.print("Player-2, please enter your name: ");
        playerTwo.setPlayerName(scanner.nextLine());

        // Each player plays by their turn 2 times
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                playerOne.playTurn(); // If modulus op returns 0, it's 1st player's turn
            } else {
                playerTwo.playTurn(); // If modulus op returns 1, it's 2nd player's turn
            }
        }
    }

    // Printing out result
    public void printScore() {
        // Printing out final scores
        System.out.printf("\n\nFinal Scores:\n%s ===> %d\t\t%s ==> %d\n",
                playerOne.getPlayerName(), playerOne.getPoint(), playerTwo.getPlayerName(), playerTwo.getPoint());

        // Determining the winner or if it's a tie
        if (playerOne.getPoint() > playerTwo.getPoint()) {
            System.out.printf("\nCongratulations, %s! You are the winner!\n", playerOne.getPlayerName());
        } else if (playerTwo.getPoint() > playerOne.getPoint()) {
            System.out.printf("\nCongratulations, %s! You are the winner!\n", playerTwo.getPlayerName());
        } else {
            System.out.println("\nIt's a tie! Well played, both of you!");
        }
    }

}
