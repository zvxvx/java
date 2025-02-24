import lab6.cscd211classes.Person;
import lab6.cscd211enums.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSCD211EnumLabTest {
    Person p = new Person("Greg", "Pappas", Color.GREEN);

    @Test
    public void testGetColor(){
        assertEquals(Color.GREEN, p.getColor());
    }
}
