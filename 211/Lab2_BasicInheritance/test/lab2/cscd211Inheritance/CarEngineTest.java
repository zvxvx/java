package lab2.cscd211Inheritance;

import lab2.cscd211Comparator.ManufacturerComparator;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CarEngineTest {
    @Test
    void fieldsTest() {
        CarEngine c = new CarEngine("Ferrari", 400);
        assertEquals("Ferrari", c.getManufacturer());
        assertEquals(400, c.getHorsePower());
    }

    @Test
    void calcOutputTest() {
        CarEngine c = new CarEngine("Ford", 250);
        assertEquals(4, c.calcOutput());
    }

    @Test
    void toStringTest() {
        CarEngine c = new CarEngine("Ford", 250);
        assertEquals("Car Engine - Manufacturer: Ford with HP of 250", c.toString());
    }

    @Test
    void compareMan() {
        CarEngine c1 = new CarEngine("AMG", 250);
        CarEngine c2 = new CarEngine("Ford", 250);
        assertEquals(-5, c1.compareTo(c2));
    }

    @Test
    void compareHorse() {
        CarEngine c1 = new CarEngine("AMG", 350);
        CarEngine c2 = new CarEngine("Ford", 250);
        assertEquals(1, c1.compareTo(c2));
    }
}