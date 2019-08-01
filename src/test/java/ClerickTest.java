import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;
import people.Clerick;

import static org.junit.Assert.assertEquals;

public class ClerickTest {

    Clerick clerick;

    @Before
    public void setUp() {
        clerick = new Clerick("Papa", HealingTool.HEALINGCROSS);
    }

    @Test
    public void name() {
        assertEquals("Papa", clerick.getName());
    }
}
