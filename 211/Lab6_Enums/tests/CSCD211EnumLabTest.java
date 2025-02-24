import lab6.cscd211classes.Person;
import lab6.cscd211comparators.ColorComparator;
import lab6.cscd211enums.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSCD211EnumLabTest {
    Person p1 = new Person("Greg", "Pappas", Color.GREEN);
    Person p2 = new Person("Jim", "Pappas", Color.PURPLE);

    @Test
    public void testGetColor(){
        assertEquals(Color.GREEN, p1.getColor());
    }

    @Test
    public void testFirstName(){
        assertEquals("Greg", p1.getFn());
    }

    @Test
    public void testLastName(){
        assertEquals("Pappas", p1.getLn());
    }

    @Test
    public void testCompare(){
       assertEquals(-1, new ColorComparator().compare(p1,
                p2), "We expect a negative number because GREEN is < PURPLE. " +
               "In this case we get -1.");
    }

    @Test
    public void testLastNameCompare(){
        assertEquals(-3, p1.compareTo(p2), "We expect a negative number " +
                "because last names " +
                "are equal, so we then compare first names, and Greg is < Jim" +
                ". In this case, compareTo gives us the negative number 3.");
    }
}
