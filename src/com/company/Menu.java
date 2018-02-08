package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);


    // create method to hold the start menu to prompt user for library options
    public void startMenu () {

        // Prompt user when they access this start menu
        System.out.println("Welcome to the video game library. What would you like to do? " +
                "\n 1. Add a game to the Video Game Library. " +
                "\n 2. Remove a game from the Library " +
                "\n 3. View what is currently in the Library. " +
                "\n 4. Check a game out. " +
                "\n 5. Check a game in. " +
                "\n 6. View checked out games. " +
                "\n 7. Exit the program.");

        try {

            // start the switch statement
            // set scanner to
            switch (input.nextInt() ) {

                case 1:
                    // Add a game
                    break;

                case 2:
                    // Remove game
                    break;

                case 3:
                    // View Library
                    break;

                case 4:
                    // Checkout game
                    break;

                case 5:
                    // Check in game
                    break;

                case 6:
                    // View checked out game
                    break;

                case 7:
                    // Exit program
                    break;

                default:
                    //
                    break;

            }
        } catch (InputMismatchException ime) {
            System.out.println("Select a number from 1 - 7.");
            input.nextLine();
            startMenu();
        }
    }
}
