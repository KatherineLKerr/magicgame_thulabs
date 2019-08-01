import action.Enemy;
import enums.Enemies;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy( "Kolingo", Enemies.YOUROWNREFLECTION, true);
    }

    @Test
    public void hasName() {
        assertEquals("Kolingo", enemy.getName());
    }

    @Test
    public void hasType() {
        assertEquals(Enemies.YOUROWNREFLECTION, enemy.getEnemy() );
    }

    @Test
    public void isDead() {
        assertEquals(true, enemy.isDead());
    }
}
