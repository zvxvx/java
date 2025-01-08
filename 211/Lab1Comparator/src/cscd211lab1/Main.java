package cscd211lab1;

import cscd211classes.Bird;
import cscd211methods.Lab1Methods;

/**
 * The main class for the Bird comparison lab.
 */
public class Main {

    /**
     * The entry point of the program. DO NOT CHANGE THIS FILE.
     */
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird("Parrot", "Macaw", 500);
        birds[1] = new Bird("Sparrow", "House Sparrow", 30);
        birds[2] = new Bird("Eagle", "Bald Eagle", 7000);

        Lab1Methods labMethods = new Lab1Methods();

        System.out.println("Unsorted Birds:");
        labMethods.displayBirds(birds);

        labMethods.sortBirdsByWeight(birds);

        System.out.println("\nSorted Birds by Weight:");
        labMethods.displayBirds(birds);

        Bird heaviest = labMethods.findHeaviestBird(birds);
        System.out.println("\nHeaviest Bird: " + heaviest);

        Bird lightest = labMethods.findLightestBird(birds);
        System.out.println("Lightest Bird: " + lightest);

        System.out.println("\nBirds in weight range 100g to 6000g:");
        labMethods.printBirdsInWeightRange(birds, 100, 6000);
    }
}
