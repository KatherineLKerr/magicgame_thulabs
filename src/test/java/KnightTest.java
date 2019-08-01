import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;
import people.Clerick;
import people.Knight;

import static enums.Weapon.BIGROCK;
import static org.junit.Assert.assertEquals;

public class KnightTest {


    private Knight knight;
    private Clerick clerick;

    @Before
    public void setUp() {
        knight = new Knight("tramp", BIGROCK);
        clerick = new Clerick("tramp2", HealingTool.HEALINGROCK);
    }

    @Test
    public void hasName() {
        assertEquals("tramp", knight.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(BIGROCK, knight.getWeapon());
    }

    @Test
    public void hasHealth() {
        assertEquals(35, knight.displayHealth());
    }

    @Test
    public void canHeal() {
        knight.heal(1);
        assertEquals(36, knight.displayHealth());
    }

    @Test
    public void canTakeDamage() {
        knight.takeDamage(1);
        assertEquals(34, knight.displayHealth());
    }

    @Test
    public void canUseWeapon() {
        knight.use(clerick);
        assertEquals(5, clerick.displayHealth());

    }
}
