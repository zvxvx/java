package lab2.cscd211Inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void calcOutput() {

        Engine engine = new Engine("Toyota", 25);
        assertEquals(5, engine.calcOutput());


    }

    @Test
    void getManufacturer() {

        Engine engine = new Engine("Honda", 9);

        assertEquals("Honda", engine.getManufacturer());

    }



    @Test
    void testToString() {
        Engine honda = new Engine("Honda", 79);

        assertEquals("Manufacturer: Honda with HP of 79", honda.toString());

    }
}