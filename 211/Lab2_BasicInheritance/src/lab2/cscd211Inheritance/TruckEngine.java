package lab2.cscd211Inheritance;

/**
 * The TruckEngine is a child of the Engine class.
 */
public class TruckEngine extends Engine implements Comparable<Engine> {

    private boolean diesel;

    /**
     * Calls the constructor from the superclass, then sets the additional boolean param.
     * @param manufacturer
     * @param horsePower
     * @param diesel
     */
    public TruckEngine(final String manufacturer, final int horsePower, final boolean diesel){
        //TODO: complete the constructor
    }

    /**
     * Calls toString() from the superclass, and adds additional info from TruckEngine class
     * Produces a String in this format (depending on the field vals):
     * Truck Engine - Manufacturer: Ford with HP of 250 is a diesel engine
     * @return a String describing the TruckEngine.
     */
    @Override
    public String toString(){
        //TODO: complete the method
    }

    /**
     * Calculates the output of the TruckEngine.
     * First calls calcOutput() from the superclass. If the engine is diesel, divide the result by 18 and return it.
     * If the engine is NOT diesel, divide the result by 8 and return it.
     * @return an int representing the TruckEngine output.
     */
    @Override
    public int calcOutput(){

        //TODO: complete the method
    }



}   // end class
