package cscd211comparators;

import cscd211classes.Bird;

import java.util.Comparator;



/**
 * A comparator class that compares Bird objects based on their weight.
 */
public class BirdComparator implements Comparator<Bird> {

    /**
     * Compares two Bird objects by their weight.
     *
     * @param b1 The first Bird object.
     * @param b2 The second Bird object.
     * @return A negative integer, zero, or a positive integer as the first bird
     *         is lighter, equal in weight, or heavier than the second bird.
     */
    @Override
    public int compare(Bird b1, Bird b2) {
        if (b1.getWeight() < b2.getWeight()) {
            return -1;
        } else if (b1.getWeight() > b2.getWeight()) {
            return 1;
        }
        return 0;
    }
}


