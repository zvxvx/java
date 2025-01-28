package lab3.cscd211inheritance;

/**
 * The Lawyer class is a child of the Employee class.
 */
public class Lawyer extends Employee{

    //TODO: the Lawyer contains the field private int stockOptions


    /**
     * The constructor for the Lawyer class.
     * First the constructor for the parent class is called.
     * Then the additional field is added.
     * @param name the Lawyer's name
     * @param basePayrate the basePayrate for the Lawyer
     * @param additionalPayrate additional pay amount for the Lawyer
     * @param stockOptions the Lawyer's stock options
     */
    public Lawyer(final String name, final double basePayrate, final double additionalPayrate,
      final int stockOptions            ){

        //TODO: complete the constructor



    }

    /**
     * A method that gets the value of stockOptions
     * @return an int, the value of stockOptions
     */
    public int getStockOptions(){

        //TODO: complete the method
    }

    /**
     * A method to create a string describing the Lawyer object.
     * Calls the toString() of the parent method.
     * @return a String in this format: Lawyer - FirstName LastName
     */
    @Override
    public String toString(){
        //TODO: complete the method
    }


    /**
     * A method that prints a report for the Lawyer.
     * Prints a string in this format: I am a lawyer. I get $180000.00 and I have 25 shares of stock.
     */
    @Override
  public void report() {

        //TODO: complete the method

        
    }
}
