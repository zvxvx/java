package lab3.cscd211inheritance;

/**
 * The Accountant class is a child of the Employee class.
 */
public class Accountant extends Employee {
    //TODO: the Accountant class contains the field: private double parkingStipend


    /**
     * This is the constructor for the Accountant class.
     * First, call the constructor from the parent class.
     * Then, add the parkingStipend field.
     * @param name the Employee's name
     * @param basePayrate the Employee's base pay rate
     * @param additionalPayrate the Employee's additional pay rate (if any)
     * @param parkingStipend the Employee's parking stipend
     * @throws IllegalArgumentException if basePayrate, additionalPayrate, or parkingStipend < 0
     */
    public Accountant(final String name, final double basePayrate, final double additionalPayrate,
                      final double parkingStipend) throws IllegalArgumentException{

        //TODO: complete the constructor

    }

    /**
     * Gets the Accountant's parkingStipend
     * @return a double, being the value of the parkingStipend
     */
    public double getParkingStipend(){

        //TODO: complete the method
    }

    /**
     * Produces a report for the Accountant and prints it to the screen.
     * Format: I am an accountant. I make $100000.00 plus a parking stipend of $50.00.
     */
    @Override
    public void report() {

        //TODO: complete the method

    }

    /**
     * Produces a string containing information about the Accountant.
     * The toString() method from the parent class is called.
     * @return a String in this format: Accountant: FirstName LastName
     */
    @Override
    public String toString(){

        //TODO: complete the method
    }
}
