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
            game.playerOne.setPointNull(); // Set players points to 0 for each game
            game.playerTwo.setPointNull(); // Set players points to 0 for ech game
            menu.replay(); // Asking user if wants to play more
        }
        // Game ends!
        menu.Farewell(); // Prints out farewell message
    }
}


