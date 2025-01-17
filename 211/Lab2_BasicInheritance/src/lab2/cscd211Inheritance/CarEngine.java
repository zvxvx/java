package lab2.cscd211Inheritance;

/**
 * The CarEngine class is a child of the Engine class.  It contains NO additional parameters.
 */

public class CarEngine extends Engine implements Comparable<Engine>{


    /**
     * Calls the constructor from the superclass.
     * @param horsePower
     * @param manufacturer
     */
    public CarEngine(final int horsePower, final String manufacturer) {

        //TODO: complete the constructor
    }

    /**
     * Calls the constructor from the superclass.
     * @param manufacturer
     * @param horsePower
     */
    public CarEngine(final String manufacturer, final int horsePower) {

        //TODO: complete the constructor
    }


    /**
     * Returns a String describing the Car Engine.
     * Calls super.toString
     * @return output in the format:
     * Car Engine - Manufacturer: General Motors with HP of 137 output of 2
     */
    @Override
    public String toString(){

        //TODO: complete the method
    }

    /**
     * Calculates the CarEngine output.
     * Calls calcOutput() from the superclass, and divides this result by 12.
     * @return the output from a CarEngine
     */
    @Override
    public int calcOutput(){

        //TODO: complete the method
    }






}
