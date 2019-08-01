import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;
import people.Clerick;
import people.Dwarf;

import static enums.Weapon.BIGROCK;
import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Clerick clerick;

    @Before
    public void setUp() {
        dwarf = new Dwarf("kiko", BIGROCK);
        clerick = new Clerick("kiko2", HealingTool.HEALINGROCK);
    }

    @Test
    public void hasName() {
        assertEquals("kiko", dwarf.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(BIGROCK, dwarf.getWeapon());
    }

    @Test
    public void hasHealth() {
        assertEquals(20, dwarf.displayHealth());
    }

    @Test
    public void canHeal() {
        dwarf.heal(1);
        assertEquals(21, dwarf.displayHealth());
    }

    @Test
    public void canTakeDamage() {
        dwarf.takeDamage(1);
        assertEquals(19, dwarf.displayHealth());
    }

    @Test
    public void canUseWeapon() {
        dwarf.use(clerick);
        assertEquals(5, clerick.displayHealth());

    }
}
