package lab2.cscd211Inheritance;


import lab2.cscd211Comparator.ManufacturerComparator;

import java.util.Comparator;

/**
 * \
 * A superclass that is the parent of CarEngine and TruckEngine.
 */

public class Engine implements Comparable<Engine> {

    protected int horsePower;
    private String manufacturer;

    /**
     * @param horsePower
     * @param manufacturer
     * @throws IllegalArgumentException if manufacturer is blank or null
     * @throws IllegalArgumentException if horsepower < 1
     */
    public Engine(final int horsePower, final String manufacturer) {
        if (manufacturer == null || manufacturer.isEmpty() || horsePower < 1) {
            throw new IllegalArgumentException();
        }
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    /**
     * \
     * A constructor for an Engine.
     *
     * @param manufacturer
     * @param horsePower
     */
    public Engine(final String manufacturer, final int horsePower) {
        if (manufacturer == null || manufacturer.isEmpty() || horsePower < 1) {
            throw new IllegalArgumentException();
        }
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
    }


    /**
     * Calculates the engine output by dividing the horsepower value by 5.
     *
     * @return an int representing the Engine output.
     */
    public int calcOutput() {
        return this.horsePower / 5;
    }

    /**
     * A String representing the Engine manufacturer.
     *
     * @return the value of the manufacturer field (no additional strings).
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * An int representing the Engine horsePower
     *
     * @return the value of the horsePower field.
     */
    public int getHorsePower() {
        return this.horsePower;
    }

    /**
     * This compareTo first compares by horsePower.  If the horsePowers are the same then
     * it compares by the manufacturer.
     *
     * @return int Representing natural order
     */
    @Override
    public int compareTo(final Engine e) {
        if (this.horsePower < e.horsePower) {
            return -1;
        } else if (this.horsePower > e.horsePower) {
            return 1;
        } else {
            return new ManufacturerComparator().compare(this, e);
        }
    }

    /**
     * Produces a String describing the Engine, in this format:
     * Manufacturer: Ford with HP of 134
     *
     * @return a String representing the Engine info
     */
    public String toString() {
        return "Manufacturer: " + this.manufacturer + " with HP of " + this.horsePower;
    }


}
