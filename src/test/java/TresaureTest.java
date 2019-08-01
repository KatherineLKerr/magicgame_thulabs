import action.Treasure;
import enums.Creature;
import org.junit.Before;
import org.junit.Test;
import people.Warlock;

import static enums.Spell.SUGAR;
import static org.junit.Assert.assertEquals;

public class TresaureTest {

    private Treasure treasure;


    @Before
    public void setUp() {
        treasure = new Treasure("gold", 3, 5);
    }

    @Test
    public void canGetType() {
        assertEquals("gold", treasure.getType());
    }

    @Test
    public void canGetAmount() {
        assertEquals(3, treasure.getAmount());
    }

    @Test
    public void canGetValue() {
        assertEquals(5, treasure.getValue());
    }


}
