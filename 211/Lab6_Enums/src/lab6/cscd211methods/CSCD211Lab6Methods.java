package lab6.cscd211methods;

import lab6.cscd211classes.Person;
import lab6.cscd211enums.Color;

public class CSCD211Lab6Methods {
    /**
     * This method fills an array with Person objects.
     * @param fin the Scanner used to read the people.txt file.
     * @param total the total number of records in the file.
     * @return returns an array filled with Person objects as read from the people.txt file.
     */

    public static Person[] fillArray(java.util.Scanner fin, int total){

        //TODO: complete the method


    }

    /**
     * A method to convert a String to a Color enum.
     * @param color the String indicating which Color enum to return.
     * @return a Color enum
     * @throws RuntimeException if the String color param does not refer
     * to a valid Color enum
     * @throws IllegalArgumentException if the color param is null
     *
     */

    private static Color convertColor(java.lang.String color){

        //TODO: complete the method

    }


    /**
     * Displays all People objects in the given array who have the given favorite color.
     * If any Person objects in the array have the given Color,
     * these Person objects are displayed to the screen by calling toString() on each Person.
     * @param toFind the favorite Color to find
     * @param myPeeps the array of People objects
     */
    public static void displayAll(Color toFind, Person[] myPeeps){

        //TODO: complete the method

    }


    /**
     * Displays the program's menu.
     * This method is given to you for free.
     * @param kb the Scanner used to read the menu choice
     * @return the menu choice (an int)
     */
    public static int menu(java.util.Scanner kb){

        if (kb == null) {
            throw new IllegalArgumentException("Scanner object cannot be null");
        }

        int choice = 0;
        boolean validInput = false;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the Array to the screen");
            System.out.println("2. Display all people that contain a certain color");
            System.out.println("3. Sort the array by Color");
            System.out.println("4. Sort the array by the 'natural order'");
            System.out.println("5. Quit");

            System.out.print("Enter your choice (1-5): ");

            if (kb.hasNextInt()) {
                choice = kb.nextInt();
                kb.nextLine(); // Consume the newline character
                if (choice >= 1 && choice <= 5) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                kb.nextLine(); // Consume the invalid input
            }

        } while (!validInput);

        return choice;
    }

    /**
     * Prints each Person object from the array of Persons.
     * @param myPeeps the array of Person objects to print to the screen
     */
    public static void printArray(Person[] myPeeps){

        //TODO: complete the method


    }

    /**
     * A method that takes the user input (a String) and converts it to a Color enum.
     * @param kb the Scanner that reads the user input.
     *           User input may be variously capitalized, such as BLUE, Blue, bLUe, etc.
     * @return a Color enum that matches the user's choice
     */
    public static Color readColor(java.util.Scanner kb){

        //TODO: complete the method
    }


}
