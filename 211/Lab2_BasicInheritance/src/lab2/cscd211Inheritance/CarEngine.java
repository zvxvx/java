package lab2.cscd211Inheritance;

/**
 * The CarEngine class is a child of the Engine class.  It contains NO additional parameters.
 */

public class CarEngine extends Engine implements Comparable<Engine> {


    /**
     * Calls the constructor from the superclass.
     *
     * @param horsePower
     * @param manufacturer
     */
    public CarEngine(final int horsePower, final String manufacturer) {
        super(horsePower, manufacturer);
    }

    /**
     * Calls the constructor from the superclass.
     *
     * @param manufacturer
     * @param horsePower
     */
    public CarEngine(final String manufacturer, final int horsePower) {
        //TODO: complete the constructor
        super(manufacturer, horsePower);
    }


    /**
     * Returns a String describing the Car Engine.
     * Calls super.toString
     *
     * @return output in the format:
     * Car Engine - Manufacturer: General Motors with HP of 137 output of 2
     * !!! The engine output is already added in main. !!!
     */
    @Override
    public String toString() {
        //TODO: complete the method
        return "Car Engine - " + super.toString();
        //+ " output of " + this.calcOutput() <-- see JDOC statement.
    }

    /**
     * Calculates the CarEngine output.
     * Calls calcOutput() from the superclass, and divides this result by 12.
     *
     * @return the output from a CarEngine
     */
    @Override
    public int calcOutput() {
        //TODO: complete the method
        return super.calcOutput() / 12;
    }


}
