package lab3.cscd211inheritance;

import java.text.NumberFormat;

/**
 * The Programmer class is a child of the Employee class.
 */
public class Programmer extends Employee {
    private boolean busPass;


    /**
     * Constructor for the Programmer object.
     * First calls the constructor from the parent class, then adds the busPass.
     *
     * @param name              the Programmer's name
     * @param basePayrate       the Programmer's base pay rate
     * @param additionalPayrate the Programmer's additional pay rate
     * @param busPass           whether or not the Programmer has a bus pass
     */
    public Programmer(final String name, final double basePayrate, final double additionalPayrate,
                      boolean busPass) {
        super(name, basePayrate, additionalPayrate);
        this.busPass = busPass;
        if (basePayrate < 0 || additionalPayrate < 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * A method to get the value of busPass
     *
     * @return a boolean, indicating whether or not the Programmer has a bus pass.
     */
    public boolean getBusPass() {
        return this.busPass;
    }

    /**
     * A method that produces a String describing the Programmer object.
     * Calls toString from the parent class.
     *
     * @return a String in this format: Programmer: FirstName LastName
     */
    @Override
    public String toString() {
        return "Programmer: " + super.toString();
    }


    /**
     * Prints a String that describes the Programmer, in this format (depending on busPass value):
     * I am a programmer. I get $60,000.00 and I get a bus pass.
     * I am a programmer. I get $65,000.00 and I do not get a bus pass.
     */
    @Override
    public void report() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyStr = formatter.format(this.getSalary());
        String bus;
        if (this.busPass) {
            bus = "I get a bus pass.";
        } else {
            bus = "I do not get a bus pass.";
        }
        System.out.println("I am a programmer. I get " + moneyStr +
                " and " + bus);
    }
}
