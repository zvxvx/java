package lab6.cscd211comparators;

import java.util.Comparator;
import lab6.cscd211classes.Person;

/**
 * This class compares two Person objects by favorite color.
 */
public class ColorComparator implements Comparator<Person> {

    /**
     * A method to compare two People objects by their favorite colors.
     * @param p1 the first object to be compared.
     * @param p2 the second object to be compared.
     * @return an int, being the result of the comparison.
     */
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getColor().compareTo(p2.getColor());
    }

}
