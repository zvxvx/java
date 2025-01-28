package lab3.cscd211inheritance;

/**
 * The Employee class is the parent class of Accountant, Lawyer, and Programmer.
 */
public abstract class Employee implements Comparable<Employee>{

    private final double BASE;
    private String name;
    protected double salary;

    protected Employee(final String name, final double basePayrate, final double additionalPayrate){
        this.name = name;
        this.BASE = basePayrate;
        this.salary = this.BASE + additionalPayrate;
    }

    /**
     * First compares Employees by type, by calling getType() from Employee class (see below).
     * If the Employees are the same type, they are next compared by salary.
     * @param another the object to be compared.
     * @return an int (0, 1, -1), signifying the result of the comparison.
     */
    @Override
    public int compareTo(Employee another) {
        //TODO: complete the method


    }

    /**
     * This method returns the BASE salary of the Employee.
     * @return a double, being the value of the BASE salary.
     */
    public double getBaseSalary(){

        //TODO: complete the method
    }

    /**
     * This method returns the Employee's salary field.
     * @return the Employee's salary
     */
    public double getSalary(){

        //TODO: complete the method
    }

    /**
     * Gets the Employee's Name value.
     * @return a String, the value of the Employee's name.
     */
    public String getName(){

        //TODO: complete the method
    }

    /**
     * Gets the name of the class, by first calling getClass() on this object.
     * Then, getSimpleName() is called on this result.
     * @return
     */
    public String getType(){

        //TODO: complete the method
    }

    /**
     * Produces a String describing the name of the object.
     * @return a String containing the Employee's name only.
     */
    @Override
    public String toString(){

        //TODO: complete the method
    }

    /**
     * This is an abstract method. It is implemented in the child classes only.
     */
    public abstract void report();




}
