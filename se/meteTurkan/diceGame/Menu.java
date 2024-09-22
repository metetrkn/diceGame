package se.meteTurkan.diceGame;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in); // Creating scanner object

    // Printing out message from top to bottom line by line func
    public void messagePrint(String[] message) {
        // Printing out line by line with sleep
        for (String line : message) {
            System.out.println(line); // Print each line
            try {
                Thread.sleep(140); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle exception
            }
        }
    }


    // Welcoming user
    public void printWelcome() {
        String[] welcomeMessage = { // Printing out welcoming message line by line
                "                                                   ",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                " _    _      _                            _         ",
                "| |  | |    | |                          | |        ",
                "| |  | | ___| | ___ ___  _ __ ___   ___  | |_ ___   ",
                "| |/\\| |/ _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ ",
                "\\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | ",
                " \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Welcome to dice competition 1.0.1!",
                "                                                   ",
                "                                                  "};

        messagePrint(welcomeMessage); // Printing welcome message top to bottom line by line

        // Printing out options menu
        System.out.println("Options:\n" +
                "   1. Play\n" +
                "   2. Exit\n\n");
    }


    public void Farewell(){
        String[] farewellMessage = {
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-",
                "                                        ",
                " _    _           _            _        ",
                "| |  | |         | |          | |       ",
                "| |__| | ___  ___| | ___   _  | | ___   ",
                "|  __  |/ _ \\/ __| |/ / | | | | |/ _ \\  ",
                "| |  | |  __/ (__|   <| |_| | | | (_) | ",
                "|_|  |_|\\___|\\___|_|\\_\\\\__,_| |_|\\___/  ",
                "                                        ",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        };

        messagePrint(farewellMessage); // Printing farewell message top to bottom line by line
    }

    public void replay() {
        System.out.println("\nDo you want to play one more turn?\n   1. Yes\n   2. No"); // Prompting user to choice if wants to play more
        int playMore = scanner.nextInt(); // Getting users answer

        if (playMore == 2) { // If user don't want to play more
            Main.key = false; // While loop in main ends
            scanner.close(); // Closing scanner object
        }
    }


    public void menu() {
            int userInput; // Declaring user input

            while (true) {
                System.out.print("Choice:\t");

                userInput = scanner.nextInt(); // Read user input as int

                // Check if the input is either 1 or 2
                if (userInput == 1) {
                    //Printing out login message
                    for (char c: "Logging in...\n\n".toCharArray()) {
                        System.out.print(c);
                        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(140));
                    }
                    Game game = new Game();
                    game.init();
                    break;

                } else if (userInput == 2){ // Exit loop on valid input
                    for (char c: "\nExiting...\n".toCharArray()) {
                        System.out.print(c);
                        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(140));
                    }
                    Farewell();
                    System.exit(0); // Exit the game
                } else {
                    System.out.println("Input must be either 1 or 2."); // Continue loop until valid input
                }

            }
        }
    }








