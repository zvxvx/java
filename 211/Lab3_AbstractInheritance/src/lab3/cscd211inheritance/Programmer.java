package lab3.cscd211inheritance;

/**
 * The Programmer class is a child of the Employee class.
 */
public class Programmer extends Employee{
    //TODO: the Programmer class contains the field private boolean busPass


    /**
     * Constructor for the Programmer object.
     * First calls the constructor from the parent class, then adds the busPass.
     * @param name the Programmer's name
     * @param basePayrate the Programmer's base pay rate
     * @param additionalPayrate the Programmer's additional pay rate
     * @param busPass whether or not the Programmer has a bus pass
     */
    public Programmer(final String name, final double basePayrate, final double additionalPayrate,
                      boolean busPass){

        //TODO: complete the constructor




    }

    /**
     * A method to get the value of busPass
     * @return a boolean, indicating whether or not the Programmer has a bus pass.
     */
    public boolean getBusPass(){
        //TODO: complete the method
    }

    /**
     * A method that produces a String describing the Programmer object.
     * Calls toString from the parent class.
     * @return a String in this format: Programmer: FirstName LastName
     */
    @Override
    public String toString(){

        //TODO: complete the method

    }


    /**
     * Prints a String that describes the Programmer, in this format (depending on busPass value):
     * I am a programmer. I get $60000.00 and I get a bus pass.
     * I am a programmer. I get $65000.00 and I do not get a bus pass.
     */
    @Override
    public void report() {

        //TODO: complete the method


    }
}
