import enums.Creature;
import enums.Spell;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;
import people.Knight;
import people.Wizard;

import static enums.Spell.SUGAR;
import static enums.Weapon.BIGROCK;
import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;


    @Before
    public void setUp() {
        wizard = new Wizard("bigbug", Creature.MOOMIN, SUGAR);
    }

    @Test
    public void hasName() {
        assertEquals("bigbug", wizard.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(SUGAR, wizard.getSpell());
    }

    @Test
    public void hasHealth() {
        assertEquals(90, wizard.displayHealth());
    }

    @Test
    public void canHeal() {
        wizard.heal(1);
        assertEquals(91, wizard.displayHealth());
    }

    @Test
    public void canTakeDamage() {
        wizard.takeDamage(1);
        assertEquals(89, wizard.displayHealth());
    }

    @Test
    public void canUseWeapon() {
        wizard.use(wizard);
        assertEquals(90, wizard.displayHealth());

    }
}
