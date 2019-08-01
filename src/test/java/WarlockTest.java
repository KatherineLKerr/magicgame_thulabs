import enums.Creature;
import org.junit.Before;
import org.junit.Test;
import people.Warlock;
import people.Wizard;

import static enums.Spell.SUGAR;
import static enums.Weapon.BIGROCK;
import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;


    @Before
    public void setUp() {
        warlock = new Warlock("jinjin", Creature.MOOMIN, SUGAR);
    }

    @Test
    public void hasName() {
        assertEquals("jinjin", warlock.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(SUGAR, warlock.getSpell());
    }

    @Test
    public void hasHealth() {
        assertEquals(90, warlock.displayHealth());
    }

    @Test
    public void canHeal() {
        warlock.heal(1);
        assertEquals(91, warlock.displayHealth());
    }
}