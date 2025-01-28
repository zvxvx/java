import lab3.cscd211inheritance.Programmer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgrammerTest {


    @Test
    public void testProgrammerSalary() {
        Programmer p = new Programmer("Randy Ellis", 40000, 20000, true);
        assertEquals(60000, p.getSalary(), 0.001);
    }


}
