package action;

import enums.Enemies;
import people.Person;

public class Enemy extends Person {
    private Enemies enemy;
    private boolean isDead;

    public Enemy(String name, Enemies enemy, boolean isDead) {
        super(name);
        this.enemy = enemy;
        this.isDead = isDead;
    }

    public Enemies getEnemy() {
        return enemy;
    }

    public boolean isDead() {
        return isDead;
    }
}
