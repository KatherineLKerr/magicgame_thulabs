import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;
import people.Barbarian;
import people.Clerick;

import static enums.Weapon.BIGROCK;
import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Clerick clerick;

    @Before
    public void setUp() {
        barbarian = new Barbarian("tramp", BIGROCK);
        clerick = new Clerick("tramp2", HealingTool.HEALINGROCK);
    }

    @Test
    public void hasName() {
        assertEquals("tramp", barbarian.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(BIGROCK, barbarian.getWeapon());
    }

    @Test
    public void hasHealth() {
        assertEquals(20, barbarian.displayHealth());
    }

    @Test
    public void canHeal() {
        barbarian.heal(1);
        assertEquals(21, barbarian.displayHealth());
    }

    @Test
    public void canTakeDamage() {
        barbarian.takeDamage(1);
        assertEquals(19, barbarian.displayHealth());
    }

    @Test
    public void canUseWeapon() {
        barbarian.use(clerick);
        assertEquals(5, clerick.displayHealth());

    }
}
