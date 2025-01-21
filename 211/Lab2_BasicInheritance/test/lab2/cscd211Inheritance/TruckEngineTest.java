package lab2.cscd211Inheritance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Trim;

import static org.junit.jupiter.api.Assertions.*;

class TruckEngineTest {
    @Test
    void fieldsTest() {
        TruckEngine t = new TruckEngine("Ford", 210, true);
        assertEquals("Ford", t.getManufacturer());
        assertEquals(210, t.getHorsePower());
        assertTrue(t.getDiesel());
    }

    @Test
    void calcOutputTest() {
        TruckEngine t = new TruckEngine("Ford", 210, false);
        assertEquals(5, t.calcOutput());
    }

    @Test
    void calcDieselOutputTest() {
        TruckEngine t = new TruckEngine("Ford", 210, true);
        assertEquals(2, t.calcOutput());
    }

    @Test
    void compareMan() {
        TruckEngine t1 = new TruckEngine("GMC", 250, true);
        TruckEngine t2 = new TruckEngine("Chevrolet", 250, false);
        assertEquals(4, t1.compareTo(t2));
    }

    @Test
    void compareHorse() {
        TruckEngine t1 = new TruckEngine("Honda", 175, false);
        TruckEngine t2 = new TruckEngine("Ford", 250, false);
        assertEquals(-1, t1.compareTo(t2));
    }

    @Test
    void toStringTest() {
        TruckEngine t1 = new TruckEngine("Ford", 250, true);
        assertEquals("Truck Engine - Manufacturer: Ford with HP of 250 is a " +
                "diesel engine", t1.toString());
        TruckEngine t2 = new TruckEngine("Ford", 250, false);
        assertEquals("Truck Engine - Manufacturer: Ford with HP of 250", t2.toString());
    }
}