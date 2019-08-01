import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;
import people.Clerick;

import static enums.HealingTool.*;
import static org.junit.Assert.assertEquals;

public class ClerickTest {

    Clerick clerick;
    Clerick person1;

    @Before
    public void setUp() {
        clerick = new Clerick("Papa", HealingTool.HEALINGCROSS);
        person1 = new Clerick("mr. clerick", HEALINGROCK);
    }

    @Test
    public void name() {
        assertEquals("Papa", clerick.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(10, clerick.displayHealth());
    }

    @Test
    public void hasHealingTool() {
        assertEquals(HEALINGCROSS, clerick.getHealingTool());
    }

    @Test
    public void canHeal() {
        clerick.heal(5);
        assertEquals(15, clerick.displayHealth());
    }

    @Test
    public void canTakeDamage() {
        clerick.takeDamage(5);
        assertEquals(5, clerick.displayHealth());
    }

    @Test
    public void canUseHealingTool() {
        clerick.use(person1);
        assertEquals(15, person1.displayHealth());
    }

    @Test
    public void canChangeTool() {
        clerick.change(HEALINGSTICK);
        assertEquals(HEALINGSTICK, clerick.getHealingTool());
    }

}
