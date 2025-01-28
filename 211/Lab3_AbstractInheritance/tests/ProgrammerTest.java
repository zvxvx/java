import lab3.cscd211inheritance.Programmer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgrammerTest {


    @Test
    public void programmerSalary() {
        Programmer p = new Programmer("Randy Ellis", 40000, 20000, true);
        assertEquals(60000, p.getSalary(), 0.001);
    }

    @Test
    public void programmerBus() {
        Programmer p = new Programmer("Randy Ellis", 40000, 20000, true);
        assertTrue(p.getBusPass());
    }

    @Test
    public void programmerString() {
        Programmer p = new Programmer("Randy Ellis", 40000, 20000, true);
        assertEquals("Programmer: Randy Ellis", p.toString());
    }

    @Test
    public void programmerReportBusPass() {
        Programmer p = new Programmer("Randy Ellis", 40000, 20000, true);
        p.report();
        System.out.println("Expected: I am a programmer. I get $60,000.00 and" +
                " I get a bus pass.");
    }

    @Test
    public void programmerReportNoBusPass() {
        Programmer p = new Programmer("Randy Ellis", 40000, 20000, false);
        p.report();
        System.out.println("Expected: I am a programmer. I get $60,000.00 and" +
                " " +
                "I do not get a bus pass.");
    }

    @Test
    public void programmerException() {
        assertThrows(IllegalArgumentException.class, () -> new Programmer(
                "Randy Ellis", -40000, 20000, true));
    }
}
