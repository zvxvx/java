package lab6.cscd211classes;

import lab6.cscd211comparators.ColorComparator;
import lab6.cscd211enums.Color;
import org.apache.commons.text.WordUtils;
/**
 * This class describes the Person objects used in this lab
 */
public class Person implements Comparable<Person>{

    private final String fn;
    private final String ln;
    private final Color color;

    /**
     * The constructor for the Person object.
     * @param fn the Person's first name
     * @param ln the Person's last name
     * @param color an enum, signifying the Person's favorite color.
     */
    public Person(String fn, String ln, Color color){
        this.fn = fn;
        this.ln = ln;
        this.color = color;
    }

    /**
     * A method to get the Person's favorite color (an enum)
     * @return an enum, being the Person's favorite color
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * Gets the Person's first name
     * @return a String, being the Person's first name
     */
    public String getFn(){
        return this.fn;
    }

    /**
     * A method to get the Person's last name
     * @return a String, being the Person's last name
     */
    public String getLn(){
        return this.ln;
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
        if (this.getLn().compareTo(o.getLn()) == 0) {
            if (this.getFn().compareTo(o.getFn()) == 0) {
                return new ColorComparator().compare(this, o);
            } else {
                return this.getFn().compareTo(o.getFn());
            }
        } else {
            return this.getLn().compareTo(o.getLn());
        }
    }

    /**
     * Creates a String describing the Person object, including their first name,
     * last name, and favorite color. First name and last name are capitalized.
     * A comma separates name and favorite color. Favorite color is in caps.
     * @return a String in this format: Faith Hillstrom, PURPLE
     * Bubba Von Bigbelly, PURPLE
     */
    public String toString(){
        return WordUtils.capitalizeFully(this.fn) + " " + WordUtils.capitalizeFully(this.ln) + ", " + this.color;
    }
}
