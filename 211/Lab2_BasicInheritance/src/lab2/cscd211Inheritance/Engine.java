package lab2.cscd211Inheritance;


/**\
 * A superclass that is the parent of CarEngine and TruckEngine.
 */

public class Engine implements Comparable<Engine> {

    protected int horsePower;
    private String manufacturer;

    /**
     *
     * @param horsePower
     * @param manufacturer
     * @throws IllegalArgumentException if manufacturer is blank or null
     * @throws IllegalArgumentException if horsepower < 1
     */
    public Engine(final int horsePower, final String manufacturer){

       //TODO: complete the constructor

    }

    /**\
     * A constructor for an Engine.
     * @param manufacturer
     * @param horsePower
     */
    public Engine(final String manufacturer, final int horsePower){

        //TODO: complete the constructor
    }


    /**
     * Calculates the engine output by dividing the horsepower value by 5.
     * @return an int representing the Engine output.
     */
    public int calcOutput(){

        //TODO: complete the method
    }

    /**
     * A String representing the Engine manufacturer.
     * @return the value of the manufacturer field (no additional strings).
     */
    public String getManufacturer(){

        //TODO: complete the method
    }

    /**
     * This compareTo first compares by horsePower.  If the horsePowers are the same then
     * it compares by the manufacturer.
     * @return int Representing natural order
     */
    @Override
    public int compareTo(final Engine pi) {

        //TODO: complete the method
    }

    /**
     * Produces a String describing the Engine, in this format:
     * Manufacturer: Ford with HP of 134
     * @return a String representing the Engine info
     */
    public String toString(){

        //TODO: complete the method
    }









}
