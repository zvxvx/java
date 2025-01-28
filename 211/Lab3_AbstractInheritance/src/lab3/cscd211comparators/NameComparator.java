package lab3.cscd211comparators;

import lab3.cscd211inheritance.Employee;

import java.util.Comparator;

/**
 * The NameComparator compares Employees by their Name field only.
 */
public class NameComparator implements Comparator<Employee> {

    /**
     * This method compares Employees by their Name strings.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return an int (-1, 1, or 0), signifying the result of the comparison.
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
