package se.meteTurkan.diceGame;

public class Main {
    public static boolean key = true;

    public static void main(String[] args) {
        // Creating object of menu
        Menu menu = new Menu();
        Game game = new Game();

        // Game starts!
        while (key) {
            menu.printWelcome(); // Prints out welcoming message
            menu.menu(game); // Pass the game object to the menu method
            game.printScore(); // Prints out final result of game
            menu.replay(); // Asking user if wants to play more
        }
        // Game ends!
        menu.Farewell(); // Prints out farewell message
    }
}


/**
 * add option checcker
 * each time when user inputs a option
 * call checker function like in calculator
 *
 *

 */
