package se.meteTurkan.diceGame;

public class Main {
    public static void main(String[] args) {
        // Creating object of menu
        Menu menu = new Menu();
        Game game = new Game();

        menu.printWelcome(); // Prints out welcoming message
        menu.menu(); // Prompting user to input option in menu
        game.printScore();
        // Game has ended!
        menu.Farewell(); // Prints out farewell message
    }

}
