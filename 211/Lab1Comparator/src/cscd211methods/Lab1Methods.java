package cscd211methods;

import cscd211classes.Bird;
import cscd211comparators.BirdComparator;

import java.util.Arrays;

/**
 * This class contains various methods for manipulating and sorting Bird objects.
 */
public class Lab1Methods {

    /**
     * Sorts an array of birds by their weight using the selection sort algorithm.
     * This method is given to you for free -- do not edit this method.
     *
     * @param birds The array of Bird objects to be sorted.
     */
    public void sortBirdsByWeight(Bird[] birds) {
        int n = birds.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (new BirdComparator().compare(birds[j], birds[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Bird temp = birds[minIndex];
            birds[minIndex] = birds[i];
            birds[i] = temp;
        }
    }

    /**
     * Displays all birds in the array by calling toString() in the Bird class.
     *
     * @param birds The array of Bird objects to be displayed.
     */
    public void displayBirds(Bird[] birds) {
        //TODO: complete the displayBirds(Bird[] birds) method
        for (Bird bird : birds)
            System.out.println(bird);
        }
    }

    /**
     * Finds and returns the bird with the maximum weight in the array.
     *
     * @param birds The array of Bird objects.
     * @return The Bird object with the maximum weight, or null if the array is empty.
     */
    public Bird findHeaviestBird(Bird[] birds) {
        //TODO: Complete the findHeaviestBird(Bird[] birds) method

    }

    /**
     * Finds and returns the bird with the minimum weight in the array.
     *
     * @param birds The array of Bird objects.
     * @return The Bird object with the minimum weight, or null if the array is empty.
     */
    public Bird findLightestBird(Bird[] birds) {
        //TODO: complete the findLightestBird(Bird[] birds) method

    }

    /**
     * Prints all birds whose weights fall within a specified range.
     *
     * @param birds     The array of Bird objects.
     * @param minWeight The minimum weight of the range (inclusive).
     * @param maxWeight The maximum weight of the range (inclusive).
     */
    public void printBirdsInWeightRange(Bird[] birds, int minWeight, int maxWeight) {
        //TODO: complete the method

    }
}
