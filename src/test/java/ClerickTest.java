import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;
import people.Clerick;

import static org.junit.Assert.assertEquals;

public class ClerickTest {

    Clerick clerick;

    @Before
    public void setUp() {
        clerick = new Clerick("Papa", 10, HealingTool.HEALINGCROSS);
    }

    @Test
    public void name() {
        assertEquals("Papa", clerick.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(10, clerick.getHealth());
    }

    
}
