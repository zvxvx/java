import cscd211classes.Bird;
import cscd211methods.Lab1Methods;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Test suite for the Lab1Methods class.
 */
public class Lab1Tests {

    private Bird[] birds;
    private Lab1Methods labMethods;

    @Before
    public void setUp() {
        birds = new Bird[]{
                new Bird("Parrot", "Macaw", 500),
                new Bird("Sparrow", "House Sparrow", 30),
                new Bird("Eagle", "Bald Eagle", 7000)
        };
        labMethods = new Lab1Methods();
    }

    @Test
    public void testSortBirdsByWeight() {
        labMethods.sortBirdsByWeight(birds);

        assertEquals("Sparrow", birds[0].getName());
        assertEquals("Parrot", birds[1].getName());
        assertEquals("Eagle", birds[2].getName());
    }

    @Test
    public void testFindHeaviestBird() {
        Bird heaviest = labMethods.findHeaviestBird(birds);

        assertNotNull(heaviest);
        assertEquals("Eagle", heaviest.getName());
        assertEquals(7000, heaviest.getWeight());
    }

    @Test
    public void testFindLightestBird() {
        Bird lightest = labMethods.findLightestBird(birds);

        assertNotNull(lightest);
        assertEquals("Sparrow", lightest.getName());
        assertEquals(30, lightest.getWeight());
    }


}

