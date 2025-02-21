package lab6.cscd211classes;

import lab6.cscd211enums.Color;

/**
 * This class describes the Person objects used in this lab
 */
public class Person implements Comparable<Person>{

    private String fn;

    private String ln;
    private Color color;

    /**
     * The constructor for the Person object.
     * @param fn the Person's first name
     * @param ln the Person's last name
     * @param color an enum, signifying the Person's favorite color.
     */
    public Person(String fn, String ln, Color color){

        //TODO: complete the constructor



    }

    /**
     * A method to get the Person's favorite color (an enum)
     * @return an enum, being the Person's favorite color
     */
    public Color getColor(){
        //TODO: complete the method

    }

    /**
     * Gets the Person's first name
     * @return a String, being the Person's first name
     */
    public String getFn(){

        //TODO: complete the method
    }

    /**
     * A method to get the Person's last name
     * @return a String, being the Person's last name
     */
    public String getLn(){

        //TODO: complete the method
    }


    /**
     * A method that compares one Person object to another Person object.
     * First, the last names are compared. If last names are equal, then
     * compare by first name. If first names are equal, compare by favorite color.
     * @param o the object to be compared.
     * @return an int, the result of the comparison (0, 1, or -1)
     */
    @Override
    public int compareTo(Person o) {

        //TODO: complete the method
    }

    /**
     * Creates a String describing the Person object, including their first name,
     * last name, and favorite color. First name and last name are capitalized.
     * A comma separates name and favorite color. Favorite color is in caps.
     * @return a String in this format: Faith Hillstrom, PURPLE
     * Bubba Von Bigbelly, PURPLE
     */
    public String toString(){

        //TODO: complete the method
    }

}
