package se.meteTurkan.diceGame;


public class Game {
    // Creating player objects
    Player playerOne = new Player();
    Player playerTwo = new Player();

    public void init() {
        // Prompting player 1 to input their name
        System.out.print("Player-1, please enter your name: ");
        playerOne.setPlayerName();

        // Prompting player 2 to input their name
        System.out.print("Player-2, please enter your name: ");
        playerTwo.setPlayerName();


        // Each player plays by their turn 2 times
        for (int i=0; i<4; i++) {
            if (i%2 == 0) {
                playerOne.playTurn(); // If modulus op returns 0-its 1st players turn
            } else {
                playerTwo.playTurn(); // If modulus op returns 1-its 2nd players turn
            }
        }
    }

    // Printing out result
    public void printScore() {
        // Score-table, winning
        System.out.printf("\n\nFinal Scores:\n%s ===> %i\t\t%ss ==> %i\n",
        playerOne.getPlayerName(), playerOne.getPoint(), playerTwo.getPlayerName(), playerTwo.getPoint());
    }


}
